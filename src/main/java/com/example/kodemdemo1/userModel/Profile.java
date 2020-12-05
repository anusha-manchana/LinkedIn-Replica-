package com.example.kodemdemo1.userModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String username;
    private String pwd;
    private String name;
    @Column(unique = true)
    private String email;
    private String des;
    private String role;
    private boolean activeornot;

    public Profile(String username, String pwd, String name, String email, String des, String role,
            boolean activeornot) {
        this.username = username;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.des = des;
        this.role = role;
        this.activeornot = activeornot;
    }

    public Profile() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;

    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDes() {
        return this.des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActiveornot() {
        return this.activeornot;
    }

    public void setActiveornot(boolean activeornot) {
        this.activeornot = activeornot;
    }

}