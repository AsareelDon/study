package com.packages.stockoverflow.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packages.stockoverflow.entity.SalesRepresentative;

@Repository
public interface SalesRepresentativeRepo extends JpaRepository <SalesRepresentative, Long> {
    Optional<SalesRepresentative> findByEmail(String email);
}
