package com.simplon.demo.Model;


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


}
