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
@Table(name="CampaignsProduct")
public class CampaignProduct {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name="id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name="campaign_id")
    private Campaign campaign;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
}
