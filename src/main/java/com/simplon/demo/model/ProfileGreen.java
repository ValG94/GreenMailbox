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

    public ProfileGreen() {
    }

    public ProfileGreen(int id, String profile, int threshold) {
        this.id = id;
        this.profile = profile;
        this.threshold = threshold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return "ProfileGreen{" +
                "id=" + id +
                ", profile='" + profile + '\'' +
                ", threshold=" + threshold +
                '}';
    }
}
