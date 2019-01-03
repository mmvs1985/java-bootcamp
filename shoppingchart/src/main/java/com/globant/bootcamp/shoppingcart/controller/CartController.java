package com.globant.bootcamp.shoppingcart.controller;


import com.globant.bootcamp.shoppingcart.persistence.model.Cart;
import com.globant.bootcamp.shoppingcart.persistence.model.Product;
import com.globant.bootcamp.shoppingcart.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(
        path = "/cart",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class CartController {

    private final CartService service;

    public CartController(final CartService service){this.service =service;}


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cart> getCarts() {
        return service.findAllCart();
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private Cart getCartById(@PathVariable("id") final Long id) {
        final Cart cart = service.findCartById(id);
        if (Objects.isNull(cart)) {
            throw new ProductNotFoundException("PERSON ID NOT FOUND: " + id);
        }
        return cart;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cart postCart(@RequestBody final Cart cart) {
        return service.createCart(cart);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cart putCart(@PathVariable(name = "id") final Long id,
                              @RequestBody final Cart cart) {
        cart.setId(id);
        final Cart updated = service.updateCart(cart);
        if (Objects.isNull(updated)) {
            throw new ProductNotFoundException("PRODUCT ID NOT FOUND: " + id);
        }
        return updated;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class ProductNotFoundException extends RuntimeException {
        public ProductNotFoundException(String message) {
            super(message);
        }
    }


}












