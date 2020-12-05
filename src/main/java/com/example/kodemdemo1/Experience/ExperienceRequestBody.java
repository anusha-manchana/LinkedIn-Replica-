package com.example.kodemdemo1.Experience;

public class ExperienceRequestBody {
    private String role;
    private String company;
    private String startMonth;
    private String endMonth;
    private String description;
    private String user;

 
    public ExperienceRequestBody(String role, String company, String startMonth, String endMonth,
            String description, String user) {
        this.role = role;
        this.company = company;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.description = description;
        this.user = user;
    }

    public ExperienceRequestBody() {
    }


    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
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

 
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}