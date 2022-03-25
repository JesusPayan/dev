package com.sharecarapi.entity;

import lombok.Data;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "driver")
@Data
public class Driver {
    @Id
    @Column(name = "driver_id")
    private String driverId;
    @Column(name = "driver_first_name")
    private String firstName;
    @Column(name = "driver_last_name")
    private String lastName;
    @Column(name = "driver_email")
    private String email;
    @Column(name = "driver_phone")
    private Long phoneNumber;
    @Column(name = "driver_profile_pic")
    private String profilePicURL;
    @Column(name = "driver_registration_date")
    private Date registrationDate;
    @Column(name = "driver_status")
    private Boolean driverStatus;
    @Column(name = "driver_doc_status")
    private Boolean docStatus;

    public Driver() {
    }

    public Driver(String driverId, String firstName, String lastName, String email, Long phoneNumber, String profilePicURL, Date registrationDate, Boolean driverStatus, Boolean docStatus) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profilePicURL = profilePicURL;
        this.registrationDate = registrationDate;
        this.driverStatus = driverStatus;
        this.docStatus = docStatus;
    }
}
