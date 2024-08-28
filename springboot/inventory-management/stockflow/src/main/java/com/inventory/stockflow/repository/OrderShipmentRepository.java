package com.inventory.stockflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.stockflow.entity.OrderShipment;

public interface OrderShipmentRepository extends JpaRepository<OrderShipment, Long> {

}
