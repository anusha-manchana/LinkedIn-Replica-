package com.example.kodemdemo1.Education;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.kodemdemo1.userModel.Profile;
import com.example.kodemdemo1.Institute.Institute;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Institute institute;

    private String startMonth;
    private String endMonth;
    private String description;
    private String course;

    @ManyToOne
    private Profile user;

    public Education(Institute institute, String startMonth, String endMonth, String description, String course,
            Profile user) {
        this.institute = institute;

        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.description = description;

        this.course = course;
        this.user = user;
    }

    public Education() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Institute
    public Institute getInstitute() {
        return this.institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public String getStartMonth() {
        return this.startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public String getEndMonth() {
        return this.endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setUser(Profile user) {
        this.user = user;
    }

    public String getUser() {
        return this.user.getUsername();
    }

}