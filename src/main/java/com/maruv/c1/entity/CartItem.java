package com.maruv.c1.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CARTITEM")
public class CartItem {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int itemID;

    @ManyToOne
    @JoinColumn(name = "productIDFK", referencedColumnName = "productID")
    @Getter(AccessLevel.NONE)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "cartIDFK", referencedColumnName = "cartID")
    @Getter(AccessLevel.NONE)
    private Cart cart;
}
