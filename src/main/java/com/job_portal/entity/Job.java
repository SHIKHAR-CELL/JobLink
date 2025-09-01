package com.job_portal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column
    @Lob 
    private String description;
    private String location;
    private String salary;

    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private User recruiter;

    // Default constructor
    public Job() {}

    // Parameterized constructor
    public Job(String title, String description, String location, String salary, User recruiter) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.salary = salary;
        this.recruiter = recruiter;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    public User getRecruiter() {
        return recruiter;
    }
    public void setRecruiter(User recruiter) {
        this.recruiter = recruiter;
    }
}
