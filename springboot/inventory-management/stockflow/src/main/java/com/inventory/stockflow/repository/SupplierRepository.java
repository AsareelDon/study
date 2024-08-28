package com.inventory.stockflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.stockflow.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
