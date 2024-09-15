package com.JuicesInc.JuicesInc.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    private String productName;
    private String category;
    private String description;
    private String ingredients;
    private Integer quantity;
    private Double price;
}
