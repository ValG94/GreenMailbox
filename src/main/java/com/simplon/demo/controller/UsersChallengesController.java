package com.simplon.demo.controller;

import com.simplon.demo.model.UserChallenge;
import com.simplon.demo.repository.UserChallengeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersChallengesController {

    private UserChallengeRepository userChallengeRepository;

    public UsersChallengesController(UserChallengeRepository userChallengeRepository) {
        this.userChallengeRepository = userChallengeRepository;
    }

    //TODO - à revoir = l'id est celui du user et non de la table UserChallenge (?)
    @GetMapping("/api/user_challenges/{id}")
    public Optional<UserChallenge> getAllChallengesByUser(@PathVariable Long id) {
        return userChallengeRepository.findById(id);
    }



}
