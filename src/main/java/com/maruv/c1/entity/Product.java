package com.maruv.c1.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
//import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int productID;
    private String prodName;
    private boolean prodStatus;
    private String prodDesc;
    private float prodPrice;
    private int prodVotes;
    //private Blob prodPicture;

    @OneToMany(mappedBy = "product")
    @Getter(AccessLevel.NONE)
    private List<CartItem> productItems;

}