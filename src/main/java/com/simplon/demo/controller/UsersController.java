package com.simplon.demo.controller;

import com.simplon.demo.model.EndUser;
import com.simplon.demo.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<EndUser> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<EndUser> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public void createUser(@RequestBody EndUser endUserToCreate) {
        userRepository.save(endUserToCreate);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody EndUser endUserToDelete) {
        userRepository.delete(endUserToDelete);
    }

   //TO REVIEW
    @PutMapping("/{id}")
    public ResponseEntity<EndUser> updateJson (@PathVariable ("id") Long id, @RequestBody EndUser endUserToModify) {
        if (!endUserToModify.getId().equals(id)) {
            return new ResponseEntity<>(endUserToModify, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(userRepository.save(endUserToModify), HttpStatus.OK); // userRepository.(id, userToModify)
        }
    }

