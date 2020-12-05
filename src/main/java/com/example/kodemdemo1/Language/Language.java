package com.example.kodemdemo1.Language;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Language {

    @Id 
    private String slug;
    private String name;
    private String type;

    


    public Language(String slug, String name, String type) {
        this.slug = slug;
        this.name = name;
        this.type = type;
    }

    public Language() {

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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        if (type == "") {
            this.type = "Core";
        } else {

            this.type = type;
        }
    }
}