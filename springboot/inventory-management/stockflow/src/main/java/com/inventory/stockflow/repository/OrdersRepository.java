package com.inventory.stockflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.stockflow.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
