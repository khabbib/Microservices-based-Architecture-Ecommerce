package com.example.OrderService.service;

import com.example.OrderService.model.Order;
import com.example.OrderService.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public ArrayList<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id);
    }

    public void createOrder(Order order) {
        //FIXME Check if the product exist in inventory. Synchronous communication.
        // Read the documentation in spring webflux and reactive programming.
        // Also the webclient documentation.
        orderRepository.save(order);
    }
}
