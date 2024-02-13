package com.JucelioDev.agregadorinvestimentos.controller;

import com.JucelioDev.agregadorinvestimentos.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){

        return null;
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
        //
        return null;
    }


}
