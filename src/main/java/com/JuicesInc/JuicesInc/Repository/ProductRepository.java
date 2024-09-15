package com.JuicesInc.JuicesInc.Repository;

import com.JuicesInc.JuicesInc.Modal.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, Integer> {
    List<Product> findByCategory(String category);
}
