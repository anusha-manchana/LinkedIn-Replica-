package com.example.kodemdemo1.Skills;

public class SkillsRequestBody {
    private String language;
    private int rating;
    private String profile;

    public SkillsRequestBody(String language, int rating, String profile) {
        this.language = language;
        this.rating = rating;
        this.profile = profile;
    }

    public SkillsRequestBody() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

}
