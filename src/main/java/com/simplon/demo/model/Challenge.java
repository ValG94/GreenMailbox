package com.simplon.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    public Challenge(int id, String nameChallenge, int level, int likeChallenge, Event event, List<ContentChallenge> contentChallengeList) {
        this.id = id;
        this.nameChallenge = nameChallenge;
        this.level = level;
        this.likeChallenge = likeChallenge;
        this.event = event;
        this.contentChallengeList = contentChallengeList;
    }

    public int getId() {
        return id;
    }

    public String getNameChallenge() {
        return nameChallenge;
    }

    public int getLevel() {
        return level;
    }

    public int getLikeChallenge() {
        return likeChallenge;
    }

    public Event getEvent() {
        return event;
    }

    public List<ContentChallenge> getContentChallengeList() {
        return contentChallengeList;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenge challenge = (Challenge) o;
        return id == challenge.id &&
                level == challenge.level &&
                likeChallenge == challenge.likeChallenge &&
                Objects.equals(nameChallenge, challenge.nameChallenge) &&
                Objects.equals(event, challenge.event) &&
                Objects.equals(contentChallengeList, challenge.contentChallengeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "id=" + id +
                ", nameChallenge='" + nameChallenge + '\'' +
                ", level=" + level +
                ", likeChallenge=" + likeChallenge +
                ", event=" + event +
                ", contentChallengeList=" + contentChallengeList +
                '}';
    }
}
