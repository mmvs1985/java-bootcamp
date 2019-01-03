package com.globant.bootcamp.shoppingcart.persistence.model;


import javax.persistence.*;

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


     @OneToMany(cascade= CascadeType.ALL)
19:     @JoinColumn(name="IdProfesor")
20:     @IndexColumn(name="idx")
21:     private List<CorreoElectronico> correosElectronicos;
*/

   @Column
   private Integer quantity;
/*
    @ManyToOne
    @JoinColumn(name="IdProduct)
    private Product product;*/

    @ManyToOne
    @JoinColumn(name="IdProduct")
    @Id
    private Product product;
}
