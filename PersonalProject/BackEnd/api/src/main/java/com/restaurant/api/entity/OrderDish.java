package com.restaurant.api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ordersdishes")
@Data
public class OrderDish {
    @Id
    @Column(name = "OrdersDishesID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "OrderID")
    private Integer orderId;

    @Column(name = "DishID")
    private Integer dishId;
}
