package com.JuicesInc.JuicesInc.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomProduct {
    @Id
    private long id;
    private String name;
    private String description;
    private String category;
    private String ingredients;
    private double price;
    private Integer quantity;
}

