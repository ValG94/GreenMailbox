package com.simplon.demo.Model;

import javax.persistence.*;

@Entity
public class ContentChallenge {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contentchallenge_id_seq")

    private Long id;
    private String questions;
    private String answers;
    private int pointChallenge;

    @ManyToOne
    private Challenge challenge;

}
