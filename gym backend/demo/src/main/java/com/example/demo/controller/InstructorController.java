package com.example.demo.controller;

import com.example.demo.model.Instructor;
import com.example.demo.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instructor> getInstructorById(@PathVariable(value = "id") String instructorID) {
        Optional<Instructor> instructor = instructorService.getInstructorById(instructorID);
        return instructor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Instructor createInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Instructor> updateInstructor(@PathVariable(value = "id") String instructorID, @RequestBody Instructor instructorDetails) {
        Instructor updatedInstructor = instructorService.updateInstructor(instructorID, instructorDetails);
        return updatedInstructor != null ? ResponseEntity.ok(updatedInstructor) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInstructor(@PathVariable(value = "id") String instructorID) {
        instructorService.deleteInstructor(instructorID);
        return ResponseEntity.noContent().build();
    }
}
