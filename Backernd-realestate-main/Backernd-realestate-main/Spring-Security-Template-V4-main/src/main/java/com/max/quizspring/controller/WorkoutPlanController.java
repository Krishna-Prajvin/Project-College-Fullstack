package com.max.quizspring.controller;

import com.max.quizspring.model.*;
import com.max.quizspring.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/workout-plans")
public class WorkoutPlanController {

    @Autowired
    private WorkoutPlanService workoutPlanService;

    @GetMapping
    public List<WorkoutPlan> getAllWorkoutPlans() {
        return workoutPlanService.getAllWorkoutPlans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutPlan> getWorkoutPlanById(@PathVariable(value = "id") String workoutPlanID) {
        Optional<WorkoutPlan> workoutPlan = workoutPlanService.getWorkoutPlanById(workoutPlanID);
        return workoutPlan.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public WorkoutPlan createWorkoutPlan(@RequestBody WorkoutPlan workoutPlan) {
        return workoutPlanService.saveWorkoutPlan(workoutPlan);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkoutPlan> updateWorkoutPlan(@PathVariable(value = "id") String workoutPlanID, @RequestBody WorkoutPlan workoutPlanDetails) {
        WorkoutPlan updatedWorkoutPlan = workoutPlanService.updateWorkoutPlan(workoutPlanID, workoutPlanDetails);
        return updatedWorkoutPlan != null ? ResponseEntity.ok(updatedWorkoutPlan) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkoutPlan(@PathVariable(value = "id") String workoutPlanID) {
        workoutPlanService.deleteWorkoutPlan(workoutPlanID);
        return ResponseEntity.noContent().build();
    }
}
