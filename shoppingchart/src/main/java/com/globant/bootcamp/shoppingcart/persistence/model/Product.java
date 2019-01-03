package com.globant.bootcamp.shoppingcart.persistence.model;

import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="IdProduct")

    private List<Item> items;
    //@Column(name = "Item")
    /*@ManyToOne
    private Item item;

@ManyToOne
13:     @JoinColumn(name="IdProfesor")
14:     private Profesor profesor;
*/
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
