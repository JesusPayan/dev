package com.restaurant.api.controller;

import com.restaurant.api.entity.Customer;
import com.restaurant.api.repository.CustomerRepository;
import com.restaurant.api.repository.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController  {
    private CustomerRepository customerRepository;

    CustomerController(CustomerRepository customerRepository){

        this.customerRepository = customerRepository;
    }
    //Mapping the events
    @GetMapping("/customers")
    List<Customer> all(){
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{id}")
    Customer getById(@PathVariable Long id){
        return customerRepository.getById(id);
    }
    @PostMapping("/customer")
    Customer newCustomer (@RequestBody Customer newCustomer){

        return customerRepository.save(newCustomer);
    }
    @GetMapping("/customers/counts")
    Long countCustomer(){

        return customerRepository.count();
    }
}
