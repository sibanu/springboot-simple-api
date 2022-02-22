package com.sibanu.task1.services;

import java.util.List;
import java.util.Optional;

import com.sibanu.task1.models.Product;
import com.sibanu.task1.repo.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public Product findOne(Long id) {
        Optional<Product> product = productRepo.findById(id);
        if (!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
        ;
    }

    public List<Product> findByName(String name) {
        return productRepo.findByName(name);
    }
}
