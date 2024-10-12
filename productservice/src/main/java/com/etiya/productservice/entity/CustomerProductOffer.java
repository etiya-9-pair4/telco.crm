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
@Table(name="CustomersProductOffers")
public class CustomerProductOffer {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name="id")
    private UUID id;
//    private List<Customer> customers;
    @ManyToOne
    @JoinColumn(name = "productoffer_id")
    private ProductOffer productOffer;
}
