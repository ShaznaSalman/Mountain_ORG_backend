package com.JuicesInc.JuicesInc.Repository;

import com.JuicesInc.JuicesInc.Modal.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
