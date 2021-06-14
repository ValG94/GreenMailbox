package com.simplon.demo.controller;

import com.simplon.demo.model.Challenge;
import com.simplon.demo.model.ProfileGreen;
import com.simplon.demo.repository.ChallengeRepository;
import com.simplon.demo.repository.ProfileGreenRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profilegreen")
public class ProfilesGreenController {

    private ProfileGreenRepository profileGreenRepository;

    public ProfilesGreenController(ProfileGreenRepository profileGreenRepository) {
        this.profileGreenRepository = profileGreenRepository;
    }

    //Méthode qui nous permettra de récupérer la liste de tous les profils green en BDD
    @GetMapping
    public List<ProfileGreen> getAllProfileGreen() {
        return profileGreenRepository.findAll();
    }

    //Méthode qui nous permettra de créer un nouveau profil en BDD
    @PostMapping
    public void createProfil(@RequestBody ProfileGreen profileGreenToCreate){
        profileGreenRepository.save(profileGreenToCreate);
    }

    //Methode qui nous permettra de mettre à jour un profil en BDD avec l'id
    @PutMapping(value = "/{id}")
    public ResponseEntity<ProfileGreen> updateJson(@PathVariable("id") int id, @RequestBody ProfileGreen resource) {
        if (resource.getId()!=id) {
            return new ResponseEntity<>(resource, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(profileGreenRepository.save(resource), HttpStatus.OK);
    }

    //Méthode qui nous permettra de supprimer des profils grâce à leur id
    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable int id){
        profileGreenRepository.deleteById(id);
    }



}
