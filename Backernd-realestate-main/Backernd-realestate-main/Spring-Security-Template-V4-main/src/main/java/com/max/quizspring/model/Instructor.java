package com.max.quizspring.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Instructor {
    @Id
    @Column(unique = true, nullable = false)
    private String instructorID;
    private String name;
    private String email;
    private String password;

    @ElementCollection
    private List<String> coursesTaught;

    private String profilePicture;

    public Instructor() {
    }

    public Instructor(String instructorID, String name, String email, String password, List<String> coursesTaught, String profilePicture) {
        this.instructorID = instructorID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.coursesTaught = coursesTaught;
        this.profilePicture = profilePicture;
    }

    public String getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
