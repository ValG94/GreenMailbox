package com.simplon.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserChallenge {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_challenge_id_seq")
    private Long id;

    @ManyToOne
    private EndUser endUser;

    @OneToMany
    private List<Challenge> challengeList;
    @OneToMany
    private List<Status> statusList;

    public UserChallenge() {
    }

    public UserChallenge(EndUser endUser, List<Challenge> challengeList, List<Status> statusList) {
        this.endUser = endUser;
        this.challengeList = challengeList;
        this.statusList = statusList;
    }

    public EndUser getUser() {
        return endUser;
    }

    public void setUser(EndUser endUser) {
        this.endUser = endUser;
    }

    @Override
    public String toString() {
        return "UserChallenge{" +
                "user=" + endUser +
                ", challengeList=" + challengeList +
                ", statusList=" + statusList +
                '}';
    }
}
