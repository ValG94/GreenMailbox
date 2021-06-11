package com.simplon.demo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_id_seq")
    private int id;

    private LocalDate dateDebut, endDate;
    private String eventName;
    private String commentEvent;

    @OneToMany
    private List<Resource> resourceList;
    @OneToMany
    private List<Challenge> challengeList;


}
