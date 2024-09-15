package com.JuicesInc.JuicesInc.Controller;

import com.JuicesInc.JuicesInc.Modal.CustomProduct;
import com.JuicesInc.JuicesInc.Service.CustomProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customProducts")
@CrossOrigin(origins = "http://localhost:5173") // frontend
public class CustomProductController {

    @Autowired
    private CustomProductService customProductService;

    @PostMapping
    public void addCustomProduct(@RequestBody CustomProduct customProduct) {
        customProductService.addCustomProduct(customProduct);
    }

    @GetMapping
    public List<CustomProduct> getAllCustomProducts() {
        return customProductService.getAllCustomProducts();
    }
}
