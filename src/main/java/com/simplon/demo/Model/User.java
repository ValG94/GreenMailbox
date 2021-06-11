package com.simplon.demo.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

        @Id
        @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
        private Long id;

        private String name;
        private String mail;
        private String password;
        private String userRight;
        private Long userChoiceFrequencyChallenge;
        private Long userChoiceChallengeDifficulty;
        @OneToMany
        private List<UserHistory> userHistory;
        @OneToMany
        private List<UserChallenge> userChallenges;


    }
