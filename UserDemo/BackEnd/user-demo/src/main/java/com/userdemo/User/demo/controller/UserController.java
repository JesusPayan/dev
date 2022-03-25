package com.userdemo.User.demo.controller;

import com.userdemo.User.demo.entity.User;
import com.userdemo.User.demo.repository.UserRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;
    //Get all
    @GetMapping("/users")
    public List<User> findAllUser (){
        return userRepository.findAll();
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<User> findById(Integer id){
        Optional <User> user = userRepository.findById(id);
        if (user.isPresent()){
            return ResponseEntity.ok(user.get());
        }else {
            throw new RuntimeException("Usuario no Encontrado");
        }
    }
    @PostMapping("/users")
    public User createUser(User user){
        return userRepository.save(user);
    }
    @PutMapping("users/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id,@RequestBody User userUpdateData){
        Optional<User> findUser = userRepository.findById(id);
        if(findUser.isPresent()){
            User userToUpdate = findUser.get();
            userToUpdate.copyDataFromUser(userUpdateData);
            User userSaved = userRepository.save(userToUpdate);
            return ResponseEntity.ok(userSaved);
        }else{
            throw new RuntimeException("Usuario no Encontrado");
        }
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable int id){
        Optional<User> findUser = userRepository.findById(id);
        if(findUser.isPresent()){
            userRepository.delete(findUser.get());
            return ResponseEntity.ok(true);
        }else{
            throw new RuntimeException("Usuario no Encontrado");

        }
    }
}
