package com.globant.bootcamp.shoppingchart.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "products",
        indexes =@Index( name = "nameindex", columnList = "name"))
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
