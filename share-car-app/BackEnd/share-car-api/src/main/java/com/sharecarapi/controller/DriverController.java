package com.sharecarapi.controller;

import com.sharecarapi.entity.Driver;
import com.sharecarapi.repository.DriverRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/driver")
public class DriverController {
    private final DriverRepository repository;

     DriverController(DriverRepository driverRepository){
        this.repository = driverRepository;

    }
    @ApiOperation("Muestra los Conductores")
    @GetMapping("/drivers")
    List<Driver> findAll(){
         return repository.findAll();
    }
    @ApiOperation("Registrar Un Conductor")
    @PostMapping("/new-driver")
    Driver newDriver(@RequestBody Driver newDriver){
         return repository.save(newDriver);
    }

}
