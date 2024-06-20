package com.martins.fstack.fullstack_app.controller;

import com.martins.fstack.fullstack_app.model.User;
import com.martins.fstack.fullstack_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/all")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
