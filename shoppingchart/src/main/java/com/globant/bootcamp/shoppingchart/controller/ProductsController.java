package com.globant.bootcamp.shoppingchart.controller;

import com.globant.bootcamp.shoppingchart.persistence.model.Product;
import com.globant.bootcamp.shoppingchart.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(
        path = "/product",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductsController {

    private final ProductService service;
    public ProductsController(final ProductService service){this.service =service;}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getProducts() {
        return service.findAllProducts();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private Product getCostumerById(@PathVariable("id") final Long id) {
        final Product costumer = service.findProductsById(id);
        if (Objects.isNull(costumer)) {
            throw new ProductNotFoundException("PERSON ID NOT FOUND: " + id);
        }
        return costumer;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product postProduct(@RequestBody final Product product) {
        return service.createProduct(product);
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Product putProduct(@PathVariable(name = "id") final Long id,
                              @RequestBody final Product product) {
        product.setId(id);
        final Product updated = service.updateproduct(product);
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
