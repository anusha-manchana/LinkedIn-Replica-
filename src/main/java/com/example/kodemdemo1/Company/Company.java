package com.example.kodemdemo1.Company;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Company {
    @Id
    private String slug;
    private String name;
    private float rating;

    public Company(String name, String slug, float rating) {
        this.name = name;
        this.slug = slug;
        this.rating = rating;
    }

    public Company(String slug) {
        this.slug = slug;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSlug() {
        return this.slug;
    }

    public float getRating() {
        return this.rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
