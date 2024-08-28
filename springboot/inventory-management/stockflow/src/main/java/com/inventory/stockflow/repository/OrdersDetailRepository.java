package com.inventory.stockflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.stockflow.entity.OrderDetails;

public interface OrdersDetailRepository extends JpaRepository<OrderDetails, Long> {

}
