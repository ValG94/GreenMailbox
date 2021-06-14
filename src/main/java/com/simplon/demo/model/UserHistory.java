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
    private User user;

    public UserHistory() {
    }

    public UserHistory(Long id, Long score, User user) {
        this.id = id;
        this.score = score;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserHistory{" +
                "id=" + id +
                ", score=" + score +
                ", user=" + user +
                '}';
    }
}
