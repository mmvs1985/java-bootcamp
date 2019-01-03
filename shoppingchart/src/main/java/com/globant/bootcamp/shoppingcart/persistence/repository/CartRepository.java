package com.globant.bootcamp.shoppingcart.persistence.repository;

import com.globant.bootcamp.shoppingcart.persistence.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart,Long> {

    @Override
    Optional<Cart> findById(Long aLong);

    @Override
    List<Cart> findAll();


}
