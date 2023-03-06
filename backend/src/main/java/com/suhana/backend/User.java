package com.suhana.backend;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity

public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String Title;
    private String Name;
    private String Description;
    private String imageLink;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDescription() {
        return Description;
    }



    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }



}
