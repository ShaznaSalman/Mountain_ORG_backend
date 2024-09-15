package com.JuicesInc.JuicesInc.Service;

import com.JuicesInc.JuicesInc.Modal.RawMaterial;
import com.JuicesInc.JuicesInc.Repository.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawMaterialService {

    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    public List<RawMaterial> getAllRawMaterials() {
        return rawMaterialRepository.findAll();
    }

    public List<RawMaterial> getRawMaterialsByCategory(String category) {
        return rawMaterialRepository.findByCategory(category);
    }

    public void addRawMaterial(RawMaterial rawMaterial) {
        rawMaterialRepository.save(rawMaterial);
    }
}
