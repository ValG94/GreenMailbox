package com.simplon.demo.model;


import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class UserHistory {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_history_id_seq")
    private Long id;

    private Long score;

    @ManyToOne
    private EndUser endUser;

    public UserHistory() {
    }

    public UserHistory(Long id, Long score, EndUser endUser) {
        this.id = id;
        this.score = score;
        this.endUser = endUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public EndUser getUser() {
        return endUser;
    }

    public void setUser(EndUser endUser) {
        this.endUser = endUser;
    }

    @Override
    public String toString() {
        return "UserHistory{" +
                "id=" + id +
                ", score=" + score +
                ", user=" + endUser +
                '}';
    }
}
