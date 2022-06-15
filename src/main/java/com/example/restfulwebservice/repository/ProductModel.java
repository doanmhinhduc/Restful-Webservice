package com.example.restfulwebservice.repository;

import com.example.restfulwebservice.entity.Product;

import java.util.List;

public interface ProductModel {
    Product save(Product product);

    Product update(Product product , int id);

    List<Product> findAll();

    Product findById(int id);
}
