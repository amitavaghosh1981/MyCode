package com.javatechie.spring.cache.api.controller;

import com.javatechie.spring.cache.api.model.User;
import com.javatechie.spring.cache.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cache-api")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUser(@PathVariable int id) {
        return service.getUser(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.delete(id);
    }

}
