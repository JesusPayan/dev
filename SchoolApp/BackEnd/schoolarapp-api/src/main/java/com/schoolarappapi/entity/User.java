package com.schoolarappapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "app_user")
@Data
public class User {
    @Column(name = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_lastname")
    private String lastName;
    @Column(name = "user_email")
    private String userRole;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "updated_date")
    private Date updatedDate;
    public User(){

    }

    public User(Integer id, String name, String lastName, String userRole, String userPassword, Date createdDate, Date updatedDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.userRole = userRole;
        this.userPassword = userPassword;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

}
