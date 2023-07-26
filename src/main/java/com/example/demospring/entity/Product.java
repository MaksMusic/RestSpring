package com.example.demospring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title; //todo дописать валидациюи создать свой екссепшен на
    // невалидный продукт как с селлером по типу SellerNotValidException
    String price;
    String descriptions;

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    Seller seller;

}
