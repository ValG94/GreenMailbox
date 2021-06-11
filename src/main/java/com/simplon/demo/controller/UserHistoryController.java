package com.simplon.demo.controller;

import com.simplon.demo.model.UserHistory;
import com.simplon.demo.repository.UserHistoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

public class UserHistoryController {

    private UserHistoryRepository userHistoryRepository;

    public UserHistoryController(UserHistoryRepository userHistoryRepository) {
        this.userHistoryRepository = userHistoryRepository;
    }

    //TODO - à revoir = l'id est celui du user et non de la table UserChallenge (?)
   @GetMapping("/api/users_histories/{id}")
    public Optional<UserHistory> getUserHistoryById(@PathVariable Long id) {
        return userHistoryRepository.findById(id);
   }


}


