package com.globant.bootcamp.shoppingcart.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;




}
