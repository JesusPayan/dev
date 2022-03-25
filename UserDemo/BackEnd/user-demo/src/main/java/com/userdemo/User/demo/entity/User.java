
package com.userdemo.User.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private Integer age;

    @Column(name = "languaje")
    private String languaje;

    User(){

    }

    public User(Integer id, String name, String email, Integer age, String languaje) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.languaje = languaje;
    }
    public void copyDataFromUser(User source){
        this.name = source.name;
        this.age = source.age;
        this.email = source.email;
        this.languaje = source.languaje;
    }
}
