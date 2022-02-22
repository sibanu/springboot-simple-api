package com.sibanu.task1.repo;

import java.util.List;

import com.sibanu.task1.models.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
}
