package com.JuicesInc.JuicesInc.Repository;

import com.JuicesInc.JuicesInc.Modal.RawMaterial;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface  RawMaterialRepository extends MongoRepository<RawMaterial, Integer> {
    List<RawMaterial> findByCategory(String category);
}
