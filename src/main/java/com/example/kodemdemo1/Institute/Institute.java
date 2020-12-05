package com.example.kodemdemo1.Institute;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.kodemdemo1.Education.Education;

@Entity
public class Institute {
    @Id
    private String slug;
    private String name;
    private float rating;

    @OneToMany(mappedBy = "institute", cascade = CascadeType.ALL) 
    private List<Education> education;

  
    public Institute(String slug, String name, float rating) {
        this.slug = slug;
        this.name = name;
        this.rating = rating;
    }

    public Institute() {

    }

    public Institute(String slug) {
        this.slug = slug;
    }

  
    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public float getRating() {
        return this.rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}

