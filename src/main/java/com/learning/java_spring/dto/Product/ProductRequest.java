package com.learning.java_spring.dto.Product;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
public class ProductRequest {
    private String title;
    private Double price;
}
