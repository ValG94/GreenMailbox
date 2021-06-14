package com.simplon.demo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_id_seq")
    private int id;

    private LocalDate dateDebut, endDate;
    private String eventName;
    private String commentEvent;

    @OneToMany
    private List<Resource> resourceList;
    @OneToMany
    private List<Challenge> challengeList;

    public Event() {
    }

    public Event(int id, LocalDate dateDebut, LocalDate endDate, String eventName, String commentEvent, List<Resource> resourceList, List<Challenge> challengeList) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.endDate = endDate;
        this.eventName = eventName;
        this.commentEvent = commentEvent;
        this.resourceList = resourceList;
        this.challengeList = challengeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", endDate=" + endDate +
                ", eventName='" + eventName + '\'' +
                ", commentEvent='" + commentEvent + '\'' +
                ", resourceList=" + resourceList +
                ", challengeList=" + challengeList +
                '}';
    }
}
