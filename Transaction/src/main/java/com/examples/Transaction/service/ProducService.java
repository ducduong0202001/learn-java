package com.examples.Transaction.service;

import com.examples.Transaction.entity.Product;
import com.examples.Transaction.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProducService {
    @Autowired
    private ProductRepository productRepository;
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void createProduct(){
        var product = new Product();
        product.setNameProduct("tao");
        product.setDate("het han");
        productRepository.save(product);
    }
}
