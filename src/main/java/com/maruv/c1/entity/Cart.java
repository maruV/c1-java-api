package com.maruv.c1.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CART")
public class Cart {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int cartID;
    private float cartTotal;

    @OneToOne
    @JoinColumn(name = "userIdFK", referencedColumnName = "userID")
    @Getter(AccessLevel.NONE)
    private User user;

    @OneToMany(mappedBy = "cart")
    @Getter(AccessLevel.NONE)
    private List<CartItem> itemList;

}
