package com.simplon.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resource_id_seq")
    private int id;

    private String typeResource;
    private String contentResource;
    private int likeResource;
    private String statusContentResource;
    private LocalDate publicationDate;

    @ManyToOne
    private Event event;

    public Resource() {
    }

    public Resource(int id, String typeResource, String contentResource, int likeResource, String statusContentResource, LocalDate publicationDate, Event event) {
        this.id = id;
        this.typeResource = typeResource;
        this.contentResource = contentResource;
        this.likeResource = likeResource;
        this.statusContentResource = statusContentResource;
        this.publicationDate = publicationDate;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeResource() {
        return typeResource;
    }

    public void setTypeResource(String typeResource) {
        this.typeResource = typeResource;
    }

    public String getContentResource() {
        return contentResource;
    }

    public void setContentResource(String contentResource) {
        this.contentResource = contentResource;
    }

    public int getLikeResource() {
        return likeResource;
    }

    public void setLikeResource(int likeResource) {
        this.likeResource = likeResource;
    }

    public String getStatusContentResource() {
        return statusContentResource;
    }

    public void setStatusContentResource(String statusContentResource) {
        this.statusContentResource = statusContentResource;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", typeResource='" + typeResource + '\'' +
                ", contentResource='" + contentResource + '\'' +
                ", likeResource=" + likeResource +
                ", statusContentResource='" + statusContentResource + '\'' +
                ", publicationDate=" + publicationDate +
                ", event=" + event +
                '}';
    }
}
