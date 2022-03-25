package com.restaurant.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "eventslocations")
@Data
public class EventLocation {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "EventName")
    private String eventName;

    @Column(name = "Location")
    private String location;


   // @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //private Event event = new Event();

}
