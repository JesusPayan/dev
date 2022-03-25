package com.veterian.api.entity;

import lombok.Data;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "pet")
@Data
public class Pet {

    @Id
    @Column(name = "pet_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pet_name")
    private String name;


    @Column (name = "pet_age")
    private Integer age;

    public Pet(){

    }
    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Pet(String name, Integer age, Long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}

