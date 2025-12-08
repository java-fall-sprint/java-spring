package com.learning.java_spring.services.Product;

import com.learning.java_spring.dto.Product.*;
import com.learning.java_spring.entities.Product;
import com.learning.java_spring.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repo;

    private ProductResponse mapToResponse(Product p){
        ProductResponse res = new ProductResponse();
        res.setId(p.getId());
        res.setTitle(p.getTitle());
        res.setPrice(p.getPrice());
        return res;
    }

    @Override
    public ProductResponse create(ProductRequest req){
        Product saved = repo.save(Product.builder()
                .title(req.getTitle())
                .price(req.getPrice())
                .build()
        );
        return mapToResponse(saved);
    }

    @Override
    public void delete(Long id)
    {
        repo.deleteById(id);
    }

    @Override
    public ProductResponse update(Long id, ProductRequest req){
        Product p = repo.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found"));

        p.setTitle(req.getTitle());
        p.setPrice(req.getPrice());

        return mapToResponse(repo.save(p));
    }

    @Override
    public List<ProductResponse> getAll(){
        return repo.findAll().stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public ProductResponse get(Long id){
        return repo.findById(id)
                .map(this::mapToResponse)
                .orElseThrow(()-> new RuntimeException("Product not found"));
    }
}
