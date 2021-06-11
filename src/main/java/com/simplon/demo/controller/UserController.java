package com.simplon.demo.controller;

import com.simplon.demo.model.User;
import com.simplon.demo.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public void createUser(@RequestBody User userToCreate) {
        userRepository.save(userToCreate);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody User userToDelete) {
        userRepository.delete(userToDelete);
    }

   //TO REVIEW
    @PutMapping("/{id}")
    public ResponseEntity<User> updateJson (@PathVariable ("id") Long id, @RequestBody User userToModify) {
        if (!userToModify.getId().equals(id)) {
            return new ResponseEntity<>(userToModify, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(userRepository.save(userToModify), HttpStatus.OK); // userRepository.(id, userToModify)
        }
    }
}
