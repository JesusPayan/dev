package com.restaurant.api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CustomersEventsID")
@Data
public class CustomerEvent {
    @Id
    @Column(name = "CustomersEventsID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerEventId;

    @Column(name = "CustomerID")
    private Integer customerId;
    @Column(name = "EventID")
    private Integer eventId;
}
