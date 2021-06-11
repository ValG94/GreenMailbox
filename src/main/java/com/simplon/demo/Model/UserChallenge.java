package com.simplon.demo.Model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class UserChallenge {

    //TODO = vérifier comment construire cette table intermédaire
    // le type de relation
    private User userIdx;
    private List<Challenge> ChallengeIdx;
    private List<Status> statusIdx;
}
