package com.maruv.c1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int addressID;

    private String street1;
    private String street2;
    private String city;
    private String state;
    private String country;
    private String zip;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdFK", referencedColumnName = "userID")
    private User user;
}
