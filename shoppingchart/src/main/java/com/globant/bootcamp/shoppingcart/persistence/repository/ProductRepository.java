package com.globant.bootcamp.shoppingcart.persistence.repository;

import com.globant.bootcamp.shoppingcart.persistence.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {

    @Override
    Optional<Product> findById(Long id);

    List<Product> findAll();

}
