package com.simplon.demo.Model;


mport javax.persistence.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserHistory {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_history_id_seq")
    private Long id;

    private Long score;

    //TODO vérifier comment construire la relation
    private UserChallenge userChallenge;
    //private Greenprofile greenProfile;

}
