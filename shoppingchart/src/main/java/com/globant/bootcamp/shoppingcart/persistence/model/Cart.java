package com.globant.bootcamp.shoppingcart.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
/*
    @OneToOne
    private Costumer costumer;
*/

@OneToMany
private List<Item> itemList;


    public Cart(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Cart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
