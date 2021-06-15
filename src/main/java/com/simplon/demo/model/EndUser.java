package com.simplon.demo.model;

import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class EndUser {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    private Long id;

    private String name;
    private String mail;
    private String password;
    private String userRight; // lambda users or administrators
    private Long userChoiceFrequencyChallenge;
    private Long userChoiceChallengeDifficulty;


    //ajouter le enum profileGreen
    @Enumerated(EnumType.STRING)
    private ProfileGreen profileGreen;

    @OneToMany (mappedBy = "endUser")
    private List<UserHistory> userHistory;

    // Users have several challenges and challenges have several users
    @ManyToMany
    @JoinTable (name= "user_challenge",
            joinColumns = {@JoinColumn(name = "fk_user", referencedColumnName= "id" ) },
            inverseJoinColumns = { @JoinColumn(name = "fk_challenge", referencedColumnName= "id") })
    private Set<Challenge> challenges = new HashSet<Challenge>();



 //création d'extraction par statut de challenge
@WhereJoinTable(clause = "status='TO_DO'")
@ManyToMany
@JoinTable(name = "user_challenge", joinColumns = @JoinColumn(name = "fk_user"), inverseJoinColumns = @JoinColumn(name = "fk_challenge"))
private List<Challenge> challengeToDo = new ArrayList<>();



    public EndUser() {
    }

    public Long getId() {
        return id;
    }

    public ProfileGreen getProfileGreen() {
        return profileGreen;
    }

    public void setProfileGreen(ProfileGreen profileGreen) {
        this.profileGreen = profileGreen;
    }

    public Set<Challenge> getChallenges() {
        return challenges;
    }

    public void setChallenges(Set<Challenge> challenges) {
        this.challenges = challenges;
    }

    public List<Challenge> getChallengeToDo() {
        return challengeToDo;
    }

    public void setChallengeToDo(List<Challenge> challengeToDo) {
        this.challengeToDo = challengeToDo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRight() {
        return userRight;
    }

    public void setUserRight(String userRight) {
        this.userRight = userRight;
    }

    public Long getUserChoiceFrequencyChallenge() {
        return userChoiceFrequencyChallenge;
    }

    public void setUserChoiceFrequencyChallenge(Long userChoiceFrequencyChallenge) {
        this.userChoiceFrequencyChallenge = userChoiceFrequencyChallenge;
    }

    public Long getUserChoiceChallengeDifficulty() {
        return userChoiceChallengeDifficulty;
    }

    public void setUserChoiceChallengeDifficulty(Long userChoiceChallengeDifficulty) {
        this.userChoiceChallengeDifficulty = userChoiceChallengeDifficulty;
    }

    public List<UserHistory> getUserHistory() {
        return userHistory;
    }

    public void setUserHistory(List<UserHistory> userHistory) {
        this.userHistory = userHistory;
    }

    public EndUser(Long id, String name, String mail, String password, String userRight, Long userChoiceFrequencyChallenge, Long userChoiceChallengeDifficulty, ProfileGreen profileGreen, List<UserHistory> userHistory, Set<Challenge> challenges, List<Challenge> challengeToDo) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.userRight = userRight;
        this.userChoiceFrequencyChallenge = userChoiceFrequencyChallenge;
        this.userChoiceChallengeDifficulty = userChoiceChallengeDifficulty;
        this.profileGreen = profileGreen;
        this.userHistory = userHistory;
        this.challenges = challenges;
        this.challengeToDo = challengeToDo;
    }

    @Override
    public String toString() {
        return "EndUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", userRight='" + userRight + '\'' +
                ", userChoiceFrequencyChallenge=" + userChoiceFrequencyChallenge +
                ", userChoiceChallengeDifficulty=" + userChoiceChallengeDifficulty +
                ", profileGreen=" + profileGreen +
                ", userHistory=" + userHistory +
                ", challenges=" + challenges +
                ", challengeToDo=" + challengeToDo +
                '}';
    }
}
