package com.simplon.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "challenge_id_seq")
    private int id;

    private String nameChallenge;
    private int level;
    private int likeChallenge;

    @ManyToOne
    private Event event;

    @OneToMany
    private List<ContentChallenge> contentChallengeList;
}
