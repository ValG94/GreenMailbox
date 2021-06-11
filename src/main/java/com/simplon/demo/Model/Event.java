package com.simplon.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_id_seq")
    private int id;

    private LocalDate dateDebut, endDate;
    private String eventName;
    private String comentEvent;
    // TODO
    //AJOUTER LES CLES ETRANGERES


}
