package com.simplon.demo.model;

import javax.persistence.*;

@Entity
public class ContentChallenge {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contentchallenge_id_seq")

    private Long id;
    private String questions;
    private String answers;
    private int pointChallenge;

    @ManyToOne
    private Challenge challenge;

    public ContentChallenge() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public int getPointChallenge() {
        return pointChallenge;
    }

    public void setPointChallenge(int pointChallenge) {
        this.pointChallenge = pointChallenge;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public ContentChallenge(Long id, String questions, String answers, int pointChallenge, Challenge challenge) {
        this.id = id;
        this.questions = questions;
        this.answers = answers;
        this.pointChallenge = pointChallenge;
        this.challenge = challenge;
    }

    @Override
    public String toString() {
        return "ContentChallenge{" +
                "id=" + id +
                ", questions='" + questions + '\'' +
                ", answers='" + answers + '\'' +
                ", pointChallenge=" + pointChallenge +
                ", challenge=" + challenge +
                '}';
    }
}
