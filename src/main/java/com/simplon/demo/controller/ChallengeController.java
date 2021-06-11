package com.simplon.demo.controller;


import com.simplon.demo.model.Challenge;
import com.simplon.demo.repository.ChallengeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/challenge")
public class ChallengeController {
    private ChallengeRepository challengeRepository;

    public ChallengeController(ChallengeRepository challengeRepository) {
        this.challengeRepository = challengeRepository;
    }

    //Méthode qui nous permettra de récupérer la liste de tous les challenges en BDD
    @GetMapping
    public List<Challenge> getAllChallenge() {
        return challengeRepository.findAll();
    }

    //Méthode qui nous permettra de créer un nouveau challenge en BDD
    @PostMapping
    public void createChallenge(@RequestBody Challenge challengeToCreate){
        challengeRepository.save(challengeToCreate);
    }

    //Methode qui nous permettra de mettre à jour un challenge en BDD avec l'id
    @PutMapping(value = "/{id}")
    public ResponseEntity<Challenge> updateJson(@PathVariable("id") int id, @RequestBody Challenge resource) {
        if (resource.getId()!=id) {
            return new ResponseEntity<>(resource, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(challengeRepository.save(resource), HttpStatus.OK);
    }

    //Méthode qui nous permettra de supprimer des challenges grâce à leur id
    @DeleteMapping("/{id}")
    public void deleteChallenge(@PathVariable int id){
        challengeRepository.deleteById(id);
    }


}


