package com.example.demospring.controller;

import com.example.demospring.dto.ResponseDto;
import com.example.demospring.dto.SellerDto;
import com.example.demospring.entity.Seller;
import com.example.demospring.service.SellerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

@RequestMapping("/seller")
public class SellerController {
        private final SellerService sellerService;

        @PostMapping("/create")
        public ResponseDto createSeller(@Valid @RequestBody Seller seller){
            return sellerService.createSeller(seller);
        }

        @GetMapping("/{id}")
        public SellerDto getSellerById(@PathVariable Long id){
            return sellerService.getSellerById(id);
        }






}
