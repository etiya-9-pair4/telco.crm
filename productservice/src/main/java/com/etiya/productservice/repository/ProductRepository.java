package com.etiya.productservice.repository;

import com.etiya.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    Optional<Product> findByNameIgnoreCase(String name);

    Optional<List<Product>> findByNameLikeIgnoreCase(String name);

}
