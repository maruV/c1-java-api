package com.maruv.c1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Orders {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int orderID;

    private String confirmationNo;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "userIdFK", referencedColumnName = "userID")
    private User user;

}
