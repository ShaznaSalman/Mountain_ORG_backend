package com.JuicesInc.JuicesInc.Service;

import com.JuicesInc.JuicesInc.Modal.CustomProduct;
import com.JuicesInc.JuicesInc.Repository.CustomProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomProductService {

    @Autowired
    private CustomProductRepository customProductRepository;

    public void addCustomProduct(CustomProduct customProduct) {
        customProductRepository.save(customProduct);
    }

    public List<CustomProduct> getAllCustomProducts() {
        return customProductRepository.findAll();
    }
}
