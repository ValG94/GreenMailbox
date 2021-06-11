package com.simplon.demo.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserChallenge {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_challenge_id_seq")
    @ManyToOne
    private User user;

    @OneToMany
    private List<Challenge> challengeList;
    @OneToMany
    private List<Status> statusList;


}
