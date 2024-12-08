package com.warehousemarket.orderservice.dto;

import java.util.List;


public class OrderRequest {

    private List<OrderItemsDTO> orderItemsDTOs;

    public List<OrderItemsDTO> getOrderItemsDTOs() {
        return orderItemsDTOs;
    }

    public void setOrderItemsDTOs(List<OrderItemsDTO> orderItemsDTOs) {
        this.orderItemsDTOs = orderItemsDTOs;
    }
}
