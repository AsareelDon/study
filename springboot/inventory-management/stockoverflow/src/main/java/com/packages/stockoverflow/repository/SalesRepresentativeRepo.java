package com.packages.stockoverflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packages.stockoverflow.entity.SalesRepresentative;

@Repository
public interface SalesRepresentativeRepo extends JpaRepository <SalesRepresentative, Long> {
    // public SalesRepresentative findByEmail(String email);
}
