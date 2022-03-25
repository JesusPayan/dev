package com.veterian.api.controller;

import com.veterian.api.entity.Pet;
import com.veterian.api.entity.Room;
import com.veterian.api.repository.RoomRepository;
import com.veterian.api.service.RoomService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

public class RoomController{
    RoomRepository repository;
    RoomService roomService;
     public RoomController(RoomRepository repository){
         this.repository = repository;
     }
     @ApiOperation("Muestra los cuartos por id")
     @GetMapping("/Room/{id}")
     public Room findById(Long id){
         return repository.findById(id).orElseGet(()->new Room(id,"Cuarto Default",1000.00));
     }

    @ApiOperation("Muestra los cuartos por id")
    @PostMapping("/new-room")
    public Room Room(@RequestBody Room room){

        return repository.save(room);
    }

     @ApiOperation("Actualiza el precio del cuarto")
     @PutMapping("/update-room/{id}/{price}")
     public Room updatePrice(@PathVariable Long id,@PathVariable Double price){
         return repository.findById(id).map(newRoom -> {
                        newRoom.setId(findById(id).getId());
                        newRoom.setName(findById(id).getName());
                        newRoom.setPrice(price);
                        return repository.save(newRoom);
                 }).orElseGet(()->{
                     Room oldRoom = new Room();
                     oldRoom.setId(id);
                     oldRoom.setName("RoomDefault");
                     oldRoom.setPrice(1000.0);
                     return repository.save(oldRoom);
         });

     }

}
