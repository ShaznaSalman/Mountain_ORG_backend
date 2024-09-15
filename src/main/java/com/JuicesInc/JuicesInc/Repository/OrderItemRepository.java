package com.JuicesInc.JuicesInc.Repository;

import com.JuicesInc.JuicesInc.Modal.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderItemRepository extends MongoRepository<OrderItem, Long> {
}