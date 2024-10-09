package com.etiya.productservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CustomersProductOffers")
public class CustomerProductOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
//    private List<Customer> customers;
    @ManyToOne
    @JoinColumn(name = "productoffer_id")
    private ProductOffer productOffer;
}
