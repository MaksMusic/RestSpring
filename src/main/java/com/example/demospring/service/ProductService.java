package com.example.demospring.service;

import com.example.demospring.dto.ProductDto;
import com.example.demospring.dto.ResponseDto;
import com.example.demospring.entity.Product;
import com.example.demospring.mappers.ProductMapper;
import com.example.demospring.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ResponseDto createProduct(Product product) {
        productRepository.save(product);
        return ResponseDto.builder()
                .answer("add new product")
                .build();
    }

    public ProductDto getProductById(Long id) {
        Product byId = productRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("нет продукта"));
        return productMapper.toProductDto(byId);
    }


    public List<ProductDto> getAllProducts() {
        return productMapper.toProductDtoList(productRepository.findAll());
    }

}
