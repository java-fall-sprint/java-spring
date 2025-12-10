package com.learning.java_spring.dto.Product;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class ProductResponse {
    private String title;
    private Double price;
    private Long id;
}
