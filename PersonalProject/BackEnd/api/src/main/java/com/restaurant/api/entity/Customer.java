package com.restaurant.api.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customers")
@Data
public class Customer {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Address")
    private String address;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private Character state;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Birthday")
    private Date birthday;


   @Column(name = "Favorite_Dish")
    private Integer favoriteDish;

}
