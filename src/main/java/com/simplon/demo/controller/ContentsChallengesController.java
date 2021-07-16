package com.simplon.demo.controller;

import com.simplon.demo.model.Challenge;
import com.simplon.demo.model.ContentChallenge;
import com.simplon.demo.repository.ChallengeRepository;
import com.simplon.demo.repository.ContentChallengeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contents")
@CrossOrigin("http://localhost:4200")
public class ContentsChallengesController {
    private ContentChallengeRepository contentChallengeRepository;

    public ContentsChallengesController(ContentChallengeRepository contentChallengeRepository) {
        this.contentChallengeRepository = contentChallengeRepository;
    }

        //Méthode qui nous permettra de récupérer la liste de tous les contenus des challenges en BDD
        @GetMapping
        public List<ContentChallenge> getAllContentChallenge() {
            return contentChallengeRepository.findAll();
        }

        @GetMapping("/{id}")
            public Optional<ContentChallenge> getContentChallengeById(@PathVariable Long id){
       return contentChallengeRepository.findById(id);
        }

        //Méthode qui nous permettra de créer un nouveau contenu en BDD
        @PostMapping
        public void createContent(@RequestBody ContentChallenge contentChallengeToCreate){
            contentChallengeRepository.save(contentChallengeToCreate);
        }

        //Methode qui nous permettra de mettre à jour le contenu d'un challenge en BDD avec l'id
        @PutMapping(value = "/{id}")
        public ResponseEntity<ContentChallenge> updateJson(@PathVariable("id") int id, @RequestBody ContentChallenge resource) {
            if (resource.getId()!=id) {
                return new ResponseEntity<>(resource, HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(contentChallengeRepository.save(resource), HttpStatus.OK);
        }

        //Méthode qui nous permettra de supprimer des contenus grâce à leur id
        @DeleteMapping("/{id}")
        public void deleteContent(@PathVariable long id){
            contentChallengeRepository.deleteById(id);
        }



    }
