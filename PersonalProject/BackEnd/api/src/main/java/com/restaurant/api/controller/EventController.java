package com.restaurant.api.controller;

import com.restaurant.api.entity.Event;
import com.restaurant.api.repository.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    private final EventRepository eventRepository;

    EventController(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }
    //Mapping the events
    @GetMapping("/events")
    List<Event> all(){

        return eventRepository.findAll();
    }

    @GetMapping("/events/{id}")
    Event getById(@PathVariable Long id){
        return  eventRepository.getById(id);
    }
    @PostMapping("/events")
    Event newEvent (@RequestBody Event newEvent){
        return eventRepository.save(newEvent);
    }
    @GetMapping("/events/counts")
    Long countEvents(){
        return eventRepository.count();
    }


}
