package com.example.demospring.controller;

import com.example.demospring.dto.ProductDto;
import com.example.demospring.dto.ResponseDto;
import com.example.demospring.entity.Product;
import com.example.demospring.entity.Seller;
import com.example.demospring.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {


    private final ProductService productService;

    @PostMapping("/create")
    public ResponseDto createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }


}
