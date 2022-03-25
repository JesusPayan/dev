package com.veterian.api.controller;

import com.veterian.api.entity.Pet;



import com.veterian.api.repository.PetRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class PetControllerTest {

@Mock
PetController petController;
@MockBean
PetRepository petRepository;
@MockBean
Pet pet;
/*
    @Test
    void findAllPetsNotNull(){
        assertNotNull(petController.findAll());
    }


    @Test
    void newPetNull() {
        assertNull(petController.newPet(Mockito.mock(pet.getClass())));
    }
    @Test
    void newPetNotNull(){
        when(petController.newPet(pet)).thenReturn(new Pet());

    }

*/
    @Test
    void findPetByName() {
    }

    @Test
    void deleteAll() {
    }
}