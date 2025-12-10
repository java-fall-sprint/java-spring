package com.learning.java_spring.services.Product;

import com.learning.java_spring.dto.Product.ProductRequest;
import com.learning.java_spring.dto.Product.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductResponse create(ProductRequest req);
    ProductResponse get(Long id);
    List<ProductResponse> getAll();
    ProductResponse update(Long id, ProductRequest req);
    void delete(Long id);
}
