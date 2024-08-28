package com.inventory.stockflow.entity;

import java.security.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "prod_category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "category_name", nullable = false, unique = false)
    private String productName;

    @Column(name = "total_stocks", nullable = false, unique = false)
    private int quantity;

    @Column(name = "status", nullable = false, unique = false)
    private String price;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
}
