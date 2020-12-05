package com.example.kodemdemo1.Experience;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.kodemdemo1.Company.Company;
import com.example.kodemdemo1.userModel.Profile;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    private String role;

    @ManyToOne 
    private Company company;

    private String startMonth;
    private String endMonth;
    private String description;

    @ManyToOne
    private Profile user;

    // Constructors
    public Experience(String role, Company company, String startMonth, String endMonth, String description,
            Profile user) {
        this.role = role;
        this.company = company;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.description = description;
        this.user = user;
    }

    public Experience() {
    }

    // User
    public void setUser(Profile user) {
        this.user = user;
    }

    public String getUser() {
        return this.user.getUsername();
    }

    // Id
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Role
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Company
    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    // StartMonth
    public String getStartMonth() {
        return this.startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    // EndMonth
    public String getEndMonth() {
        return this.endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    // Description
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
