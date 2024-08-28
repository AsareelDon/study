package com.inventory.stockflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.stockflow.entity.ProductCategory;

public interface ProdCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
