package com.JuicesInc.JuicesInc.Controller;

import com.JuicesInc.JuicesInc.Modal.RawMaterial;
import com.JuicesInc.JuicesInc.Service.RawMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/raw-materials")
@CrossOrigin(origins = "http://localhost:5173") // Frontend
public class RawMaterialController {

    @Autowired
    private RawMaterialService rawMaterialService;

    @GetMapping
    public List<RawMaterial> getAllRawMaterials() {
        return rawMaterialService.getAllRawMaterials();
    }

    @GetMapping("/category/{category}")
    public List<RawMaterial> getRawMaterialsByCategory(@PathVariable String category) {
        return rawMaterialService.getRawMaterialsByCategory(category);
    }

    @PostMapping
    public void addRawMaterial(@RequestBody RawMaterial rawMaterial) {
        rawMaterialService.addRawMaterial(rawMaterial);
    }
}
