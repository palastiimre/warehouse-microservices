package com.warehousemarket.orderservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order_items")
@Getter
@Setter
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "price")
    private Long price;

    @Column(name = "quantity")
    private Long quantity;
}
