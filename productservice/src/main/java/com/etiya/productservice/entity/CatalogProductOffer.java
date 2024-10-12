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
@Table(name="CatalogProductOffer")
public class CatalogProductOffer {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name="id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "productoffer_id")
    private ProductOffer productOffer;
    @ManyToOne
    @JoinColumn(name = "catalog_id")
    private Catalog catalog;
}
