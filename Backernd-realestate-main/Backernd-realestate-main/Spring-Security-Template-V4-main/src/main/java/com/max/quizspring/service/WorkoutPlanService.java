package com.max.quizspring.service;


import com.max.quizspring.model.*;
import com.max.quizspring.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutPlanService {

    @Autowired
    private WorkoutPlanRepository workoutPlanRepository;

    public List<WorkoutPlan> getAllWorkoutPlans() {
        return workoutPlanRepository.findAll();
    }

    public Optional<WorkoutPlan> getWorkoutPlanById(String workoutPlanID) {
        return workoutPlanRepository.findById(workoutPlanID);
    }

    public WorkoutPlan saveWorkoutPlan(WorkoutPlan workoutPlan) {
        return workoutPlanRepository.save(workoutPlan);
    }

    public WorkoutPlan updateWorkoutPlan(String workoutPlanID, WorkoutPlan workoutPlanDetails) {
        if (workoutPlanRepository.existsById(workoutPlanID)) {
            workoutPlanDetails.setWorkoutPlanID(workoutPlanID);
            return workoutPlanRepository.save(workoutPlanDetails);
        }
        return null;
    }

    public void deleteWorkoutPlan(String workoutPlanID) {
        workoutPlanRepository.deleteById(workoutPlanID);
    }
}
