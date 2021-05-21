package com.maruv.c1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userID;

    private String fName;
    private String lName;
    private String email;
    private String password;

    @OneToOne
    @JoinColumn(name = "cartIdFK", referencedColumnName = "cartID")
    private Cart cart;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Address> addressList;
}
