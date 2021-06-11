package com.simplon.demo.controller;


import com.simplon.demo.model.Status;
import com.simplon.demo.repository.StatusRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatusController {
    private StatusRepository statusRepository;

    public StatusController(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @GetMapping("/api/status")
    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    @PostMapping("api/status")
    public void createStatus(@RequestBody Status statusToCreate) {
        statusRepository.save(statusToCreate);
    }





}