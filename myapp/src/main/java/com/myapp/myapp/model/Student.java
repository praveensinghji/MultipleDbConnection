package com.myapp.myapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Student {
//    private int id;
    private String name;
    private String email;
    private String department;
    private LocalDateTime modifiedDate;
    public LocalDate sendUIDate;

    public Student() {
    }

    public Student(String name, String email, String department, LocalDateTime modifiedDate, LocalDate sendUIDate) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.modifiedDate = modifiedDate;
        this.sendUIDate = sendUIDate;
    }

    public LocalDate getSendUIDate() {
        return sendUIDate;
    }

    public void setSendUIDate(LocalDate sendUIDate) {
        this.sendUIDate = sendUIDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
