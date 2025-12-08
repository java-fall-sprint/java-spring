package com.learning.java_spring.controllers;

import com.learning.java_spring.dto.Product.ProductRequest;
import com.learning.java_spring.dto.Product.ProductResponse;
import java.util.List;
import com.learning.java_spring.services.Product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;
    
    @PostMapping
    public ProductResponse create(@RequestBody ProductRequest req)
    {
        return service.create(req);
    }
    
    @GetMapping("/{id}")
    public ProductResponse get(@PathVariable Long id){
        return service.get(id);
    }
    
    @GetMapping
    public List<ProductResponse> getAll(){
        return service.getAll();
    }
    
    @PutMapping("/{id}")
    public ProductResponse update(@PathVariable Long id, @RequestBody ProductRequest req){
        return service.update(id, req);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
