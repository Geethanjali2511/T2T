package com.example.TBlog.controller;


import com.example.TBlog.services.UsersService;
import com.example.TBlog.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;


    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUsers(@RequestBody Users users){
        usersService.createUsers(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(users);
    }

    @GetMapping("/users/{id}")
    Users findUsersByID(@PathVariable int id) {
        return usersService.getUsersById(id);
    }
}
