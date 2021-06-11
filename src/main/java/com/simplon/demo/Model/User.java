package com.simplon.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

        @Id
        @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
        private Long id;

        private String name;
        private String mail;
        private String password;
        private String userRight;
        private Long userChoiceFrequenceChallenge;
        private Long userChoiceChallengeDifficulty;
        //TODO
        private UserHistory userHistory;

    }
