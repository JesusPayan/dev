package com.restaurant.api.entity;



import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "events")
@Data
public class Event {
    @Id
    @Column(name = "EventID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Location")
    private String location;

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    //@JoinColumn(name = "PK_EVENTLOCATION",nullable = false,updatable = false)
    //List<EventLocation> eventLocations = new ArrayList<>();

}
