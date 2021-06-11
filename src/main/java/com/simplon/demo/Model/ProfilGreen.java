package com.simplon.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfilGreen {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profilgreen_id_seq")
    private int id;
    private String profil;
}
