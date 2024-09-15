package com.JuicesInc.JuicesInc.Repository;

import com.JuicesInc.JuicesInc.Modal.CustomProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomProductRepository extends MongoRepository<CustomProduct, Integer> {
}
