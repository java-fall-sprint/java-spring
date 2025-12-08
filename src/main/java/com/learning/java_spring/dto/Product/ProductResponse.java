package com.learning.java_spring.dto.Product;
import lombok.Data;

@Data
public class ProductResponse {
    private String title;
    private Double price;
    private Long id;
}
