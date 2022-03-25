package com.veterian.api.controller;

import com.veterian.api.entity.Owner;
import com.veterian.api.entity.Pet;
import com.veterian.api.repository.OwnerRepository;
import com.veterian.api.repository.PetRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController{

    private final OwnerRepository ownerRepository;



     public OwnerController(OwnerRepository repository){

         this.ownerRepository = repository
;
     }



    @ApiOperation("Muestra a los Dueños de Mascotas")
    @GetMapping("/all")

    public List<Object> findAllObjects() {
        return Collections.singletonList(ownerRepository.findAll());
    }


   /*
    List<Owner> findAll(){

         return ownerRepository.findAll();
    }*/
    @ApiOperation("Muestra los Datos del Dueño de la(s) Mascotas por nombre")
    @GetMapping("/{name}")
    Owner findByName(String name){
        return ownerRepository.findByName(name);
    }
    @ApiOperation("Agrega un Nuevo Dueño de Mascota")
    @PostMapping("/new-owner")
    Owner newOwner(Owner owner){
         return ownerRepository.save(owner);
    }

}
