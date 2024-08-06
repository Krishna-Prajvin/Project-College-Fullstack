package com.example.demo.service;

import com.example.demo.model.Instructor;
import com.example.demo.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    public Optional<Instructor> getInstructorById(String instructorID) {
        return instructorRepository.findById(instructorID);
    }

    public Instructor saveInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public void deleteInstructor(String instructorID) {
        instructorRepository.deleteById(instructorID);
    }

    public Instructor updateInstructor(String instructorID, Instructor instructorDetails) {
        Optional<Instructor> optionalInstructor = instructorRepository.findById(instructorID);
        if (optionalInstructor.isPresent()) {
            Instructor instructor = optionalInstructor.get();
            instructor.setName(instructorDetails.getName());
            instructor.setEmail(instructorDetails.getEmail());
            instructor.setPassword(instructorDetails.getPassword());
            instructor.setCoursesTaught(instructorDetails.getCoursesTaught());
            instructor.setProfilePicture(instructorDetails.getProfilePicture());
            return instructorRepository.save(instructor);
        } else {
            return null; // or throw an exception
        }
    }
}
