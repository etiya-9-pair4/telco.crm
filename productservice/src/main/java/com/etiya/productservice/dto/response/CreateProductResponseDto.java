package com.etiya.productservice.dto.response;

import com.etiya.productservice.entity.CampaignProduct;
import com.etiya.productservice.entity.Catalog;
import com.etiya.productservice.entity.ProductCharacteristicValue;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductResponseDto {
    private UUID id;
    private String name;
    private BigDecimal price;
    private Integer stock;
    private UUID catalogId;
    private ProductCharacteristicValue productCharacteristicValuesId;
    private List<CampaignProduct> campaignProducts;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deletedDate;
}
