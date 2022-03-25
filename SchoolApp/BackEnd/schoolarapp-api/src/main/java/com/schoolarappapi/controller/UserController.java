package com.schoolarappapi.controller;

import com.schoolarappapi.entity.User;
import com.schoolarappapi.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@RestController
@Controller
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){

        return userRepository.findAll();
    }
    @GetMapping("/users/{id}")
    public Object getUserById(int id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return ResponseEntity.ok(user.get());
        }else{
            return new NoSuchElementException("Usuario no encontrado");
        }
    }
}
