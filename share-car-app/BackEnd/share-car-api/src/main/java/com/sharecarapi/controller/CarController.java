package com.sharecarapi.controller;

import com.sharecarapi.ShareCarException;
import com.sharecarapi.entity.Car;
import com.sharecarapi.repository.CarRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository repository) {
        this.carRepository = repository;
    }

    @ApiOperation("Obtener Todos los Autos Registrados")
    @GetMapping("/all")
    public List<Car> findAll(){
        return carRepository.findAll();
    }
    @ApiOperation("Obtener Coches por id")
    @GetMapping("/{id)")
    public Car getById(Long id){
        return carRepository.findById(id).get();
    }

    @ApiOperation("Registrar un Nuevo Auto")
    @PostMapping("/new-car")
    public Car newCan(@RequestBody Car newCar){
        return carRepository.save(newCar);

    }
}
