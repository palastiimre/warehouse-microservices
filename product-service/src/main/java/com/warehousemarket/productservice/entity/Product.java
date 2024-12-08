package com.warehousemarket.productservice.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
@Getter
@Setter
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "product_name")
    @Nonnull
    private String name;

    @Column(name = "product_desciption")
    @Nonnull
    private String description;

    @Column(name = "product_price")
    @Nonnull
    private BigDecimal price;
}
