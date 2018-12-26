package com.globant.bootcamp.shoppingcart.persistence.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

   /* //@JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_asignatura", foreignKey = @ForeignKey(name="curso_asignatura_fkey"))
    private Asignatura asignatura;
*/

   @OneToMany
    private List<Product> products;




}
