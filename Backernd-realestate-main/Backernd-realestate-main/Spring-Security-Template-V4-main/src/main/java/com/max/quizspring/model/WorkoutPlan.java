package com.max.quizspring.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class WorkoutPlan {
    @Id
    @Column(unique = true, nullable = false)
    private String workoutPlanID;
    private String title;
    
    @ElementCollection
    private List<String> exercises; // References Exercise
    
    private String memberID; // References Member

    public WorkoutPlan() {
    }

    public WorkoutPlan(String workoutPlanID, String title, List<String> exercises, String memberID) {
        this.workoutPlanID = workoutPlanID;
        this.title = title;
        this.exercises = exercises;
        this.memberID = memberID;
    }

    // Getters and Setters
    public String getWorkoutPlanID() {
        return workoutPlanID;
    }

    public void setWorkoutPlanID(String workoutPlanID) {
        this.workoutPlanID = workoutPlanID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public void setExercises(List<String> exercises) {
        this.exercises = exercises;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
}
