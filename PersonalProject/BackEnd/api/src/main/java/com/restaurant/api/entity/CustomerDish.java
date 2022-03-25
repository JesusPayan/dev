package com.restaurant.api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customerdishes")
@Data
public class CustomerDish {

    @Id
    @Column(name = "CustomerDishesID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerDishesId;

    @Column(name = "CustomerID")
    private Integer customerId;

    @Column(name = "DishID")
    private Integer dishId;

}
