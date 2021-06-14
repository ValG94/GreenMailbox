package com.simplon.demo.controller;

import com.simplon.demo.model.Challenge;
import com.simplon.demo.model.Resource;
import com.simplon.demo.repository.ChallengeRepository;
import com.simplon.demo.repository.ResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourcesController {

    private ResourceRepository resourceRepository;

    public ResourcesController(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    //Méthode qui nous permettra de récupérer la liste de toutes les ressources en BDD
    @GetMapping
    public List<Resource> getAllResource() {
        return resourceRepository.findAll();
    }

    //Méthode qui nous permettra de créer une nouvelles ressource en BDD
    @PostMapping
    public void createResource(@RequestBody Resource resourceToCreate){
        resourceRepository.save(resourceToCreate);
    }

    //Methode qui nous permettra de mettre à jour une ressource en BDD avec l'id
    @PutMapping(value = "/{id}")
    public ResponseEntity<Resource> updateJson(@PathVariable("id") int id, @RequestBody Resource resource) {
        if (resource.getId()!=id) {
            return new ResponseEntity<>(resource, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(resourceRepository.save(resource), HttpStatus.OK);
    }

    //Méthode qui nous permettra de supprimer une ressource grâce à son  id
    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable int id){
        resourceRepository.deleteById(id);
    }


}
