package com.veterian.api.repository;

import com.veterian.api.entity.PetRace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PetRaceRepository extends JpaRepository<PetRace,Long> {


}
