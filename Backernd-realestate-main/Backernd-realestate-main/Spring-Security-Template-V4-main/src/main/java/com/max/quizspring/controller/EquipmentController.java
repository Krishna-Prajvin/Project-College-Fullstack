package com.max.quizspring.controller;

import com.max.quizspring.model.*;
import com.max.quizspring.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/equipments")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @GetMapping
    public List<Equipment> getAllEquipments() {
        return equipmentService.getAllEquipments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable(value = "id") String equipmentID) {
        Optional<Equipment> equipment = equipmentService.getEquipmentById(equipmentID);
        return equipment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Equipment createEquipment(@RequestBody Equipment equipment) {
        return equipmentService.saveEquipment(equipment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipment> updateEquipment(@PathVariable(value = "id") String equipmentID, @RequestBody Equipment equipmentDetails) {
        Equipment updatedEquipment = equipmentService.updateEquipment(equipmentID, equipmentDetails);
        return updatedEquipment != null ? ResponseEntity.ok(updatedEquipment) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEquipment(@PathVariable(value = "id") String equipmentID) {
        equipmentService.deleteEquipment(equipmentID);
        return ResponseEntity.noContent().build();
    }
}
