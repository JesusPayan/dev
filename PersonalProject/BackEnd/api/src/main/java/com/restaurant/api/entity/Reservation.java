package com.restaurant.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservations" )
@Data
public class Reservation {
    @Id
    @Column(name = "reservationID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customerID")
    private Integer customerId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "PartySize")
    private Integer partySize;


}
