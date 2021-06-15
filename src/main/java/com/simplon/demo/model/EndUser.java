package com.simplon.demo.model;

import javax.persistence.*;
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
    private String userRight;
    private Long userChoiceFrequencyChallenge;
    private Long userChoiceChallengeDifficulty;
    //TODO ajouter le enum profileGreen

    @OneToMany (mappedBy = "endUser")
    private List<UserHistory> userHistory;

    // Users have several challenges and challenges have several users
    @ManyToMany
    @JoinTable (name= "user_challenge",
            joinColumns = {@JoinColumn(name = "fk_user", referencedColumnName= "id" ) },
            inverseJoinColumns = { @JoinColumn(name = "fk_challenge", referencedColumnName= "id") })
    private Set<Challenge> challenges = new HashSet<Challenge>();


 //TODO => création d'extraction par statut de challenge
//    @WhereJoinTable(clause = "status='TO_DO'")
//    @ManyToMany
//    @JoinTable(name = "user_challenge", joinColumns = @JoinColumn(name = "fk_user"), inverseJoinColumns = @JoinColumn(name = "fk_challenge"))
//    private List<Group> moderatorGroups = new ArrayList<>();
//


    public EndUser() {
    }

    public Long getId() {
        return id;
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

    public EndUser(Long id, String name, String mail, String password, String userRight, Long userChoiceFrequencyChallenge, Long userChoiceChallengeDifficulty, List<UserHistory> userHistory, List<UserChallengeRelation> userChallengeRelations) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.userRight = userRight;
        this.userChoiceFrequencyChallenge = userChoiceFrequencyChallenge;
        this.userChoiceChallengeDifficulty = userChoiceChallengeDifficulty;
        this.userHistory = userHistory;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", userRight='" + userRight + '\'' +
                ", userChoiceFrequencyChallenge=" + userChoiceFrequencyChallenge +
                ", userChoiceChallengeDifficulty=" + userChoiceChallengeDifficulty +
                ", userHistory=" + userHistory+"}";
    }

}
