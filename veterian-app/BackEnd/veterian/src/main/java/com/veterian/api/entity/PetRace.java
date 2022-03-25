package com.veterian.api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "pet_race")
@Data
public class PetRace {
    @Id
    @Column(name = "race_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "race_name")
    private String name;
    public PetRace(){

    }

    public PetRace(String name) {
        this.name = name;
    }
}
