package com.etiya.productservice.entity;

import com.etiya.productservice.core.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "catalog")
public class Catalog extends BaseEntity {

    @Column(name = "parent_id")
    private UUID parentId;

    @OneToMany(mappedBy = "catalog")
    private List<Product> products;

    @OneToMany(mappedBy = "catalog")
    private List<CatalogProductOffer> catalogProductOffers;

//    @PrePersist
//    @PreUpdate
//    private void setParentId() {
//        this.parentId = this.getId();
//    }
}
