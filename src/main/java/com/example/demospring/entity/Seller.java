package com.example.demospring.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor


@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "name")
    @NotNull(message = "name must be not null")
    String name;
    @NotNull(message = "email must be not null")
    @Column(name = "email")
    String email;
    @NotNull(message = "phone_number must be not null")
    @Column(name = "phone_number")
    String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_id", referencedColumnName = "id")
    List<Product> productList = new ArrayList<>();

}
