package com.warehousemarket.orderservice.repository;

import com.warehousemarket.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
