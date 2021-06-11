package com.simplon.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfileGreen {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_green_id_seq")
    private int id;
    private String profile;
    private int threshold;
}
