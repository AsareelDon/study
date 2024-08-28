package com.inventory.stockflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.stockflow.entity.SalesRepresentative;

public interface SalesRepresentativeRepository extends JpaRepository<SalesRepresentative, Long> {

}
