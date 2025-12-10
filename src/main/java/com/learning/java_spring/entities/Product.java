package com.learning.java_spring.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Double price;
}
