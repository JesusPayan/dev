package com.veterian.api.repository;

import com.veterian.api.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet,Long> {
    @Query(value = "SELECT * FROM pet WHERE pet_race=?id", nativeQuery = true)
    List<Pet> findByRace(Long id);
    @Query(value = "SELECT * FROM pet WHERE pet_name =? name ", nativeQuery = true)
    Pet findPetByName(String name);
    @Query(value = "SELECT * FROM pet", nativeQuery = true)
    List<Pet> findAllPets();
}
