package com.simplon.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


// Table intermédiaire pour attribuer un statut à chaque relation user_challenge

@Entity (name = "user_challenge")
public class UserChallengeRelation implements Serializable {

    @Id
    @Column(name = "fk_user", insertable = false, updatable = false)
    private Long userId;

    @Id
    @Column(name = "fk_challenge", insertable = false, updatable = false)
    private Long challengeId;

    @Enumerated(EnumType.STRING)
            private Status status;

    public UserChallengeRelation() {
    }

    public UserChallengeRelation(Long userId, Long challengeId, Status status) {
        this.userId = userId;
        this.challengeId = challengeId;
        this.status = status;
    }
}
