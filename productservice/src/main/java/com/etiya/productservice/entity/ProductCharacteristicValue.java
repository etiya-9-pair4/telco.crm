package com.etiya.productservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ProductCharecteristicValue")
public class ProductCharacteristicValue {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name="id")
    private UUID id;
    @Column(name="value")
    private String value;

    @ManyToOne
    @JoinColumn(name = "characteristic_id")
    private Characteristic characteristic;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
