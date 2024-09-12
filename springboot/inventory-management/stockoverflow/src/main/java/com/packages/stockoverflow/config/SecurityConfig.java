package com.packages.stockoverflow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    private final AuthenticationProvider authenticationProvider;
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // return http
        //     .authorizeHttpRequests((auth) -> auth
        //         .requestMatchers("/").permitAll()
        //         .requestMatchers("/api/v1/**").authenticated()
        //         .anyRequest().permitAll()
        //     )
        //     .csrf((csrf) -> csrf.disable())
        //     .httpBasic((basic) -> basic.disable())
        //     .sessionManagement((session) -> session.sessionCreationPolicy(
        //         SessionCreationPolicy.STATELESS
        //     )).build();

        http
            .csrf((csrf) -> csrf.disable())
            .authorizeHttpRequests()
            .requestMatchers("")
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authenticationProvider(authenticationProvider)
            .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)


        return http.build();
    }
}
