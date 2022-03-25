package com.restaurant.api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "dishes")
@Data
public class Dish {
    @Id
    @Column(name = "DishID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private Double price;




}
