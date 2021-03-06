package com.cha.serverproductmanagement.service;

import com.cha.serverproductmanagement.model.Product;
import com.cha.serverproductmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(final Product product){
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(final Product product){
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(final Long productId){
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Long numberOfProducts(){
        return productRepository.count();
    }
}
