package com.packages.stockoverflow.services;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.packages.stockoverflow.dto.JwtPayloadDto;

import javax.crypto.SecretKey;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import io.jsonwebtoken.security.SignatureException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.util.Date;
import java.util.function.Function;

@Service
public class JwtServices {

    @Value("${security.jwt.secret-key}")
    private String secretKey;

    @Value("${security.jwt.expiration-time-ms}")
    private Long expirationTime;

    private final ObjectMapper payloadDtoMapper = new ObjectMapper();

    public JwtPayloadDto extractUserFromToken(String headerToken) {
        return extractClaims(headerToken, claims -> {
            String payloadJson = claims.getSubject();
            try {
                return payloadDtoMapper.readValue(payloadJson, JwtPayloadDto.class);
            } catch (JsonProcessingException e) {
                throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, 
                    "Deserialization Error: There's a problem when retrieving object from claims", e
                );
            }
        });
    }

    /**
     * 
     * @param <T> -> generic type casting
     * @param headerToken
     * @param claimResolver
     * @return Object of generic type T
     */
    public <T> T extractClaims(String headerToken, Function<Claims, T> claimResolver) {
        final Claims claims = extractAllClaims(headerToken);
        return claimResolver.apply(claims);
    }

    public String generateToken(JwtPayloadDto payloadDto) throws JsonProcessingException {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        SecretKey key = Keys.hmacShaKeyFor(keyBytes);

        ObjectMapper objectMapper = new ObjectMapper();
        String payload = objectMapper.writeValueAsString(payloadDto);

        return Jwts
            .builder()
            .subject(payload)
            .issuedAt(new Date(System.currentTimeMillis()))
            .expiration(new Date(System.currentTimeMillis() + expirationTime))
            .signWith(key)
            .compact();
    }

    /**
     * @param headerToken
     * @return Claims -> values that are encrypted in jwt
     */
    public Claims extractAllClaims(String headerToken) {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        SecretKey key = Keys.hmacShaKeyFor(keyBytes);

        // using try-catch, throw an exeption error as response
        try {
            /**
             * from jwts parse decoded headerToken
             * store values as claims
             */
            Claims claims = Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(headerToken)
                .getPayload();

            // validate headerToken if expired
            Date expiredAt = claims.getExpiration();
            Date currentDate = new Date();

            if (!currentDate.before(expiredAt)) {
                throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Token has expired");
            }
            return claims;

        } catch (SignatureException e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid token signature", e);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Token parsing error", e);
        }
    }
}
