package com.warehousemarket.orderservice.service;

import com.warehousemarket.orderservice.dto.OrderItemsDTO;
import com.warehousemarket.orderservice.dto.OrderRequest;
import com.warehousemarket.orderservice.entities.Order;
import com.warehousemarket.orderservice.entities.OrderItems;
import com.warehousemarket.orderservice.interfaces.IOrderService;
import com.warehousemarket.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class OrderService implements IOrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderItems> orderItems = orderRequest.getOrderItemsDTOs().stream().map(this::mapToDTOo).toList();

        order.setOrderItemsList(orderItems);

        orderRepository.save(order);
    }

    private OrderItems mapToDTOo(OrderItemsDTO orderItemsDTO) {

        OrderItems orderItems = new OrderItems();
        orderItems.setPrice(orderItemsDTO.getPrice());
        orderItems.setQuantity(orderItemsDTO.getQuantity());
        orderItems.setSkuCode(orderItemsDTO.getSkuCode());
            return orderItems;
    }
}
