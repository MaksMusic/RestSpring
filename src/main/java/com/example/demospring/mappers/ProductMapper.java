package com.example.demospring.mappers;

import com.example.demospring.dto.ProductDto;
import com.example.demospring.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    List<ProductDto> toProductDtoList(List<Product> productsList);

    Product toProductEntity(ProductDto productDto);

    ProductDto toProductDto(Product product);
}
