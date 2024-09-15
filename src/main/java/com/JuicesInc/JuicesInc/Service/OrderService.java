package com.JuicesInc.JuicesInc.Service;
import com.JuicesInc.JuicesInc.Modal.Order;
import com.JuicesInc.JuicesInc.Modal.OrderItem;
import com.JuicesInc.JuicesInc.Repository.OrderItemRepository;
import com.JuicesInc.JuicesInc.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;


    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(String id) {
        return orderRepository.findById(id);
    }
}