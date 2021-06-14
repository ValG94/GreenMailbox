package com.simplon.demo.controller;

import com.simplon.demo.model.Challenge;
import com.simplon.demo.model.ContentChallenge;
import com.simplon.demo.model.Event;
import com.simplon.demo.repository.ChallengeRepository;
import com.simplon.demo.repository.ContentChallengeRepository;
import com.simplon.demo.repository.EventRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventsController {
    private EventRepository eventRepository;

    public EventsController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    //Méthode qui nous permettra de récupérer la liste de tous les events en BDD
    @GetMapping
    public List<Event> getAllEvent() {
        return eventRepository.findAll();
    }

    //Méthode qui nous permettra de créer un nouvel event en BDD
    @PostMapping
    public void createEvent(@RequestBody Event eventToCreate){
        eventRepository.save(eventToCreate);
    }

    //Methode qui nous permettra de mettre à jour un event en BDD avec l'id
    @PutMapping(value = "/{id}")
    public ResponseEntity<Event> updateJson(@PathVariable("id") int id, @RequestBody Event resource) {
        if (resource.getId()!=id) {
            return new ResponseEntity<>(resource, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(eventRepository.save(resource), HttpStatus.OK);
    }

    //Méthode qui nous permettra de supprimer des events grâce à leur id
    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable int id){
        eventRepository.deleteById(id);
    }
}


