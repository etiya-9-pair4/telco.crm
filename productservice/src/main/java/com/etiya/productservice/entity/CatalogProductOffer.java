package com.etiya.productservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CatalogProductOffer")
public class CatalogProductOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "productoffer_id")
    private ProductOffer productOffer;
    @ManyToOne
    @JoinColumn(name = "catalog_id")
    private Catalog catalog;
}
