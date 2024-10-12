package com.etiya.orderservice.client;

import com.etiya.orderservice.dto.product.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@FeignClient(name="productservice") // Eurekada iletişime geçeceğim servis ismi
public interface ProductServiceClient
{
    @PostMapping("/api/products/search")
    List<ProductDto> findAllByIds(List<Integer> ids);
}