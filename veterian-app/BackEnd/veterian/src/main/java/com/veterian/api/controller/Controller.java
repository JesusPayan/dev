package com.veterian.api.controller;

import com.veterian.api.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class Controller implements JpaRepository<Object, Long> {

    public static JpaRepository controllerRepository;

}
