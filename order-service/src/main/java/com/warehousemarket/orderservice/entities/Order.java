package com.warehousemarket.orderservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Column(name = "order_number")
    private String orderNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItems> orderItemsList;
}
