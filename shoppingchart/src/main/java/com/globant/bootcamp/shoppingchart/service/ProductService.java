package com.globant.bootcamp.shoppingchart.service;

import com.globant.bootcamp.shoppingchart.persistence.model.Product;
import com.globant.bootcamp.shoppingchart.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductService {

    private final ProductRepository repository;

    @Autowired
    public ProductService(final ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAllProducts() {return repository.findAll();
    }

    public Product findProductsById(final Long id){
        return repository.findById(id)
                .orElse(null);
    }


    public Product createProduct(final Product product) {
        product.setId(null);
        return repository.save(product);
    }

    public Product updateproduct(final Product product) {
        final Product original = findProductsById(product.getId());
        if (Objects.isNull(original)) {
            return null;
        }
        return repository.save(product);
    }
}
