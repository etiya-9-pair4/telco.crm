package com.etiya.productservice.entity;

import com.etiya.productservice.core.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Campaigns")
public class Campaign extends BaseEntity {
    @Column(name="status")
    private boolean status;
    @Column(name="start_date")
    private LocalDateTime startDate;
    @Column(name="end_date")
    private LocalDateTime endDate;
    @Column(name="campaign_code")
    private String campaignCode;
    @Column(name="discount_rate")
    private short discountRate;
//
//    @OneToMany(mappedBy = "campaign")
//    private List<CampaignProduct> campaignProducts;
}
