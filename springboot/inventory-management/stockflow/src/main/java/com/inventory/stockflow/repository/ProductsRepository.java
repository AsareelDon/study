package com.inventory.stockflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.stockflow.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
