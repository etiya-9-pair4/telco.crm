package com.etiya.productservice.service;

import com.etiya.productservice.dto.request.CreateProductRequestDto;
import com.etiya.productservice.dto.request.DeleteProductRequestDto;
import com.etiya.productservice.dto.request.UpdateProductRequestDto;
import com.etiya.productservice.dto.response.CreateProductResponseDto;
import com.etiya.productservice.dto.response.ListProductResponseDto;
import com.etiya.productservice.dto.response.UpdateProductResponseDto;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    //TODO: MapStruct
    @Override
    public List<ListProductResponseDto> getAll() {
        return null;
    }

    @Override
    public DeleteProductRequestDto delete(DeleteProductRequestDto deleteProductRequestDto) {
        return null;
    }

    @Override
    public CreateProductResponseDto add(CreateProductRequestDto createProductRequestDto) {
        return null;
    }

    @Override
    public UpdateProductResponseDto update(UpdateProductRequestDto updateProductRequestDto) {
        return null;
    }
}
