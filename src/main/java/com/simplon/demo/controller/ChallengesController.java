package com.simplon.demo.controller;


import com.simplon.demo.model.Challenge;
import com.simplon.demo.repository.ChallengeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/challengeList")
@CrossOrigin("http://localhost:4200")
public class ChallengesController {
    private ChallengeRepository challengeRepository;

    public ChallengesController(ChallengeRepository challengeRepository) {
        this.challengeRepository = challengeRepository;
    }

    //Méthode qui nous permettra de récupérer la liste de tous les challenges en BDD
    @GetMapping
    public List<Challenge> getAllChallenge() {
        return challengeRepository.findAll();
    }

    // Retourne un challenge avec l'id
    @GetMapping("/{id}")
    public Optional<Challenge> getChallengeById(@PathVariable Long id) { return challengeRepository.findById(id);}

    //Méthode qui nous permettra de créer un nouveau challenge en BDD
    @PostMapping
    public void createChallenge(@RequestBody Challenge challengeToCreate){
        challengeRepository.save(challengeToCreate);
    }

    //Methode qui nous permettra de mettre à jour un challenge en BDD avec l'id
    @PutMapping(value = "/{id}")
    public ResponseEntity<Challenge> updateJson(@PathVariable("id") Long id, @RequestBody Challenge resource) {
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


