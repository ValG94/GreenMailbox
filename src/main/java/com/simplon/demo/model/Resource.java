package com.simplon.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resource_id_seq")
    private int id;

    private String typeResource;
    private String contentResource;
    private int likeResource;
    private String statusContentResource;
    private LocalDate publicationDate;

    @ManyToOne
    private Event event;
}
