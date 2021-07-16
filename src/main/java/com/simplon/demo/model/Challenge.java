package com.simplon.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import java.util.*;

@JsonIdentityInfo( // permet d'éviter une boucle entre deux objets bidirectionnels
        // indique l'origine ( notion à bien repréciser)
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")

@Entity
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "challenge_id_seq")
    private Long id;

    private String nameChallenge;
    private int level;
    private int likeChallenge; // TODO transformer en enum?

    @ManyToOne
    private Event event;

    @JsonIgnore // pour afficher la liste des challenges sans tenir compte du statut des users
    @ManyToMany
    private Set<EndUser> endUsers =new HashSet<EndUser>();

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

     // pour afficher la liste des challenges sans le contenu
    @OneToMany (mappedBy = "challenge")
        private List<ContentChallenge> contentChallengeList;

    public Challenge(Long id, String nameChallenge, int level, int likeChallenge, Event event, List<ContentChallenge> contentChallengeList) {
        this.id = id;
        this.nameChallenge = nameChallenge;
        this.level = level;
        this.likeChallenge = likeChallenge;
        this.event = event;
        this.contentChallengeList = contentChallengeList;
    }

    public Challenge() {
    }

    public Long getId() {
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

    public void setId(Long id) {
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
