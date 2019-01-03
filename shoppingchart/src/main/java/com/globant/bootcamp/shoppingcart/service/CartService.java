package com.globant.bootcamp.shoppingcart.service;


import com.globant.bootcamp.shoppingcart.persistence.model.Cart;
import com.globant.bootcamp.shoppingcart.persistence.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CartService {


    private final CartRepository repository;

    @Autowired
    public CartService(final CartRepository repository) {
        this.repository = repository;
    }

    public List<Cart> findAllCart() {
        return repository.findAll();
    }


    public Cart findCartById(final Long id) {
        return repository.findById(id)
                .orElse(null);
    }

    /*public Cart findCostumerByEmail(final String email) {
        return repository.findByEmail(email)
                .orElse(null);
    }*/

    public Cart createCart(final Cart cart) {
        cart.setId(null);
        return repository.save(cart);
    }

    public Cart updateCart(final Cart cart) {
        final Cart original = findCartById(cart.getId());
        if (Objects.isNull(original)) {
            return null;
        }
        return repository.save(cart);
    }
}
