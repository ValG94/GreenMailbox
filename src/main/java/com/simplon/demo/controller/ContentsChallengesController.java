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
@RequestMapping("/api/challenges/{challengeId}/contents")
@CrossOrigin("http://localhost:4200")
public class ContentsChallengesController {
    private ContentChallengeRepository contentChallengeRepository;

    public ContentsChallengesController(ContentChallengeRepository contentChallengeRepository) {
        this.contentChallengeRepository = contentChallengeRepository;
    }

        //Méthode qui nous permettra de récupérer la liste de tous les contenus pour un ID challenge
        @GetMapping
        public List<ContentChallenge> getContentChallengeListByChallengeId(@PathVariable Long challengeId) {
            return contentChallengeRepository.findContentChallengeByChallengeId(challengeId);
        }

        //Méthode pour récupérer un contenu par ID content_challenge (NB: pas besoin de faire référence au challengeId)
        @GetMapping("/{contentId}")
            public Optional<ContentChallenge> getContentChallengeById(@PathVariable Long contentId){
       return contentChallengeRepository.findById(contentId);
        }

        //Méthode qui nous permettra de créer un nouveau contenu en BDD
        @PostMapping
        public void createContentChallenge(@RequestBody ContentChallenge contentChallengeToCreate){
            contentChallengeRepository.save(contentChallengeToCreate);
        }

        //Methode qui nous permettra de mettre à jour le contenu d'un challenge en BDD avec l'id
        @PutMapping // modif 30/08 => simplication de la méthode en supprimant l'information du challengeId, info dans le request body (value = "/{contentId}")
        public ResponseEntity<ContentChallenge> updateJson(@RequestBody ContentChallenge resource) {
            return new ResponseEntity<>(contentChallengeRepository.save(resource), HttpStatus.OK);
        }

        //Méthode qui nous permettra de supprimer des contenus grâce à leur id
        @DeleteMapping("/{contentId}")
        public void deleteContent(@PathVariable Long contentId){
            contentChallengeRepository.deleteById(contentId);
        }
    }
