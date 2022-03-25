package com.veterian.api.controller;

import com.veterian.api.entity.PetRace;
import com.veterian.api.repository.PetRaceRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@RequestMapping("/pet/race")
public class PetRaceController {

    private final PetRaceRepository raceRepository;

    public PetRaceController(PetRaceRepository raceRepository) {

        this.raceRepository = raceRepository;
    }
    @ApiOperation("Obtener todas las Especies")
    @GetMapping("/all")
    List<PetRace> findAll(){

        return  raceRepository.findAll();
    }

    @ApiOperation("Guarda una Especie")
    @PostMapping("/new-especie")
    PetRace newRace(@RequestBody PetRace race){
        return raceRepository.save(race);
    }
    @ApiOperation("Elimina una especie")
    @DeleteMapping("/delete/{id}")
    void deleteRace(Long id){
        raceRepository.deleteById(id);
    }
    @ApiOperation("Elimina los registros")
    @DeleteMapping("delete")
    void deleteAll(){
        raceRepository.deleteAll();
    }




}
