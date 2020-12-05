package com.example.kodemdemo1.Education;

public class EducationSerializer {

    private String institute;

    private String startMonth;
    private String endMonth;
    private String description;
    private String course;

    private String user;

    public EducationSerializer(String institute, String startMonth, String endMonth, String description, String course,
            String user) {
        this.institute = institute;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.description = description;
        this.course = course;
        this.user = user;
    }

    public EducationSerializer() {
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
