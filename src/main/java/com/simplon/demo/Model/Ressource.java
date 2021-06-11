package com.simplon.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Ressource {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ressource_id_seq")
    private int id;

    private String typeRessource;
    private String contentRessource;
    private int likeRessource;
    private String statutContentRessource;
    private LocalDate publicationDate;
}
