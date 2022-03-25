package com.veterian.api.repository;

import com.veterian.api.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OwnerRepository extends JpaRepository <Owner,Long> {

    @Query(value = "SELECT  * FROM owner", nativeQuery = true)
    List<Owner> findAll();

    @Query(value = "SELECT * FROM owner WHERE first_name=:name",nativeQuery = true)
    Owner findByName(String name);
}
