package com.warehousemarket.orderservice.interfaces;

import com.warehousemarket.orderservice.dto.OrderRequest;

public interface IOrderService {

    void placeOrder(OrderRequest orderRequest);
}
