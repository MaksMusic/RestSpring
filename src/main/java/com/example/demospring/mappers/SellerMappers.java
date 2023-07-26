package com.example.demospring.mappers;

import com.example.demospring.dto.SellerDto;
import com.example.demospring.entity.Seller;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SellerMappers {
    SellerDto toSellerDto(Seller seller);
    Seller toSellerEntity(SellerDto sellerDto);
}
