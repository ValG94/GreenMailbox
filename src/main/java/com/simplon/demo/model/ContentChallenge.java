package com.simplon.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@JsonIdentityInfo( // permet d'éviter une boucle entre deux objets bidirectionnels
        // indique l'origine ( notion à bien repréciser)
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")

@Entity
public class ContentChallenge {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contentchallenge_id_seq")

    private Long id;
    private String questions;
    private String answers;


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


    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public ContentChallenge(Long id, String questions, String answers, Challenge challenge) {
        this.id = id;
        this.questions = questions;
        this.answers = answers;
        this.challenge = challenge;
    }

    @Override
    public String toString() {
        return "ContentChallenge{" +
                "id=" + id +
                ", questions='" + questions + '\'' +
                ", answers='" + answers + '\'' +
                ", challenge=" + challenge +
                '}';
    }
}
