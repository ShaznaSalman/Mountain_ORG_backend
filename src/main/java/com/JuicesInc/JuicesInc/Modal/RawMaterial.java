package com.JuicesInc.JuicesInc.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RawMaterial {
    @Id
    private Integer id;
    private String name;
    private double price;
    private String category;
}