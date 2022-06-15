package com.example.restfulwebservice.model;

import com.example.restfulwebservice.entity.Product;

import java.util.List;

public interface ProductModel {
    List<Product> getProduct();
    boolean addProduct(Product e);
    boolean updateProduct(Product e, int id);
}
