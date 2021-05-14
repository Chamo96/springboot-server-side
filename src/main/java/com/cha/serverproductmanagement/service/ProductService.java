package com.cha.serverproductmanagement.service;

import com.cha.serverproductmanagement.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();

    Long numberOfProducts();
}
