package com.veterian.api.controller;

import com.veterian.api.entity.Pet;
import com.veterian.api.exceptions.PetNotFoundException;
import com.veterian.api.repository.PetRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/pet")
@EnableSwagger2
public final class PetController{

private final PetRepository petRepository;


    public PetController(PetRepository repository) {
        this.petRepository = repository;

    }
    public void petController(){

   }
    @ApiOperation(value = "Muestra todos las mascotas")
    @GetMapping(value = "/all")

    public List<Object> findAllObjects() {
        return Collections.singletonList(petRepository.findAll());

    }
    /*
    @ApiOperation(value = "Muestra todos las mascotas")
    @GetMapping(value = "/sorted")
    @Override
    public List<Object> findAllSorted(){
        return Collections.singletonList().sort(fin);
    }*/
/*
    @ApiOperation(value = "Muestra todos las mascotas")
    @GetMapping(value = "/all")
    List<Pet>  findAllPets(){
        return petRepository.findAllPets();
    }*/
    @ApiOperation(value = "Muestra la mascota por identificador")
    @GetMapping("/{id}")
    public Pet findByid(Long id){

        return petRepository.findById(id).orElseThrow(()->new PetNotFoundException(id));
    }
    @ApiOperation(value = "Agrega una nueva Mascota a la Base de Datos")
    @PostMapping("/pet")
    public Pet newPet(@RequestBody Pet pet){

        return petRepository.save(pet);
    }
    @ApiOperation(value = "Muestra la mascota por raza")
    @GetMapping("/{race}")

    public List<Pet> findAllByRace(Long race){
        return petRepository.findByRace(race);
    }
    @ApiOperation(value = "Busqueda de Mascota por nombre")

    @GetMapping("/{name}")
    public Pet findPetByName(String name){
        return petRepository.findPetByName(name);
    }

    @ApiOperation("Elimina Todos los Registros de la tabla")
    @DeleteMapping("/delete")
    public void deleteAll(){
        petRepository.deleteAll();
    }
    @ApiOperation("Muestra las Mascotas por nombre")
    @GetMapping("/optional/{name}")
    /*
    public Optional<Pet> findByNameWithLambda(String name){
        return petRepository.findAll()
                            .stream()
                            .filter(pet -> pet.getName().equalsIgnoreCase(name))
                            .findFirst();
    }*/

    //@ApiOperation("Actualizar masccota")
    @PutMapping("/update/{id}/{name}")//recibe 2 parametros un id y el parametro que se quiere actualizar
    Pet updatePetName(@PathVariable Long id, @PathVariable String name){
        /*
     Pet newPet = petRepository.getById(id);
        newPet.setName(name);
        return petRepository.save(newPet);
        Pet oldPet = new Pet();//crea una nueva instancia de la clase Pet Vacia
*/
        return petRepository.findById(id).map(
                updatedPet ->{//crea un nuevo pet al cual se le asignan los parametros:
                        updatedPet.setAge(findByid(id).getAge());//Age
                        updatedPet.setId(findByid(id).getId());//Id
                        updatedPet.setName(name);//nuevo nombre
                        return petRepository.save(updatedPet);//se guardar el nuevo registro en la tabla pet, pero con diferente nombre
                        }).orElseGet(()->{// en caso contrario a la instancia vacia se le asigna el
            Pet oldPet = new Pet();//crea una nueva instancia de la clase Pet Vacia
            oldPet.setId(id);//id
            oldPet.setAge(1);// la edad
            oldPet.setName("Mascota");// y el nombre
            return petRepository.save(oldPet);// se guarda el entity
        });

    }



}
