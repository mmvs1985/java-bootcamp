package com.globant.bootcamp.shoppingchart.persistence.model;


import javax.persistence.*;

@Entity
@Table(name = "items",
        indexes =@Index( name = "nameindex", columnList = "productId"))
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;



}
