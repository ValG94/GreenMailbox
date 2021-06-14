package com.simplon.demo.model;

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

    public UserChallenge() {
    }

    public UserChallenge(User user, List<Challenge> challengeList, List<Status> statusList) {
        this.user = user;
        this.challengeList = challengeList;
        this.statusList = statusList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserChallenge{" +
                "user=" + user +
                ", challengeList=" + challengeList +
                ", statusList=" + statusList +
                '}';
    }
}
