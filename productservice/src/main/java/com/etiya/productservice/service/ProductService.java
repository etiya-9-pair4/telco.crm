package com.etiya.productservice.service;

import com.etiya.productservice.dto.request.CreateProductRequestDto;
import com.etiya.productservice.dto.request.DeleteProductRequestDto;
import com.etiya.productservice.dto.request.UpdateProductRequestDto;
import com.etiya.productservice.dto.response.CreateProductResponseDto;
import com.etiya.productservice.dto.response.ListProductResponseDto;
import com.etiya.productservice.dto.response.UpdateProductResponseDto;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    //ListProductResponseDto getById(UUID id);

    List<ListProductResponseDto> getAll();

    //List<ListProductResponseDto> getByName(String name);

    DeleteProductRequestDto delete(DeleteProductRequestDto deleteProductRequestDto);

    CreateProductResponseDto add(CreateProductRequestDto createProductRequestDto);

    UpdateProductResponseDto update(UpdateProductRequestDto updateProductRequestDto);
}
