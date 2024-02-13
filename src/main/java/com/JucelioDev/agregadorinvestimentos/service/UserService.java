package com.JucelioDev.agregadorinvestimentos.service;

import com.JucelioDev.agregadorinvestimentos.controller.CreateUserDto;
import com.JucelioDev.agregadorinvestimentos.entity.User;
import com.JucelioDev.agregadorinvestimentos.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto){
       var entity = new User(
               UUID.randomUUID(),
               createUserDto.username(),
               createUserDto.email(),
               createUserDto.password(),
               Instant.now(),
               null);
      var userSaved = userRepository.save(entity);

      return userSaved.getUserId();
    }
}
