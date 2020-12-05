package com.example.kodemdemo1.Skills;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.kodemdemo1.Language.Language;
import com.example.kodemdemo1.userModel.Profile;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;

    @ManyToOne 
    private Language language;
    private int rating;

    @ManyToOne 
    private Profile profile;

    public Skills(Language language, int rating, Profile profile) {
        this.language = language;
        this.rating = rating;
        this.profile = profile;
    }

    public Skills() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

   
    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

  
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getProfile() {
        return this.profile.getUsername();
    }

}