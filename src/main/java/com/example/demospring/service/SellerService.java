package com.example.demospring.service;

import com.example.demospring.dto.ResponseDto;
import com.example.demospring.dto.SellerDto;
import com.example.demospring.entity.Seller;
import com.example.demospring.mappers.SellerMappers;
import com.example.demospring.repositories.SellerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SellerService {
    private final SellerRepository sellerRepository;

    private final SellerMappers sellerMappers;


    public ResponseDto createSeller(Seller seller) {
        sellerRepository.save(seller);
        return ResponseDto.builder()
                .answer("add new Seller")
                .build();
    }


    public SellerDto getSellerById(Long id) {
        return sellerMappers.toSellerDto(
                sellerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("не найден продавец"))
        );

    }

//    public List<SellerDto> getAllSeller(){
//         sellerRepository.findAll();
//    }


}
