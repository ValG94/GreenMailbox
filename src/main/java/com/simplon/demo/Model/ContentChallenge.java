package com.simplon.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContentChallenge {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contentchallenge_id_seq")

    private Long id;
    private String questions;
    private String answers;
    private int pointChallenge;

    //TODO
    //Clé étrangère vers Challenge

}
