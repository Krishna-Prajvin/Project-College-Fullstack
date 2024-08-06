package com.example.demo.service;


import com.example.demo.model.Equipment;
import com.example.demo.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    public List<Equipment> getAllEquipments() {
        return equipmentRepository.findAll();
    }

    public Optional<Equipment> getEquipmentById(String equipmentID) {
        return equipmentRepository.findById(equipmentID);
    }

    public Equipment saveEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public void deleteEquipment(String equipmentID) {
        equipmentRepository.deleteById(equipmentID);
    }

    public Equipment updateEquipment(String equipmentID, Equipment equipmentDetails) {
        Optional<Equipment> optionalEquipment = equipmentRepository.findById(equipmentID);
        if (optionalEquipment.isPresent()) {
            Equipment equipment = optionalEquipment.get();
            equipment.setName(equipmentDetails.getName());
            equipment.setDescription(equipmentDetails.getDescription());
            equipment.setStatus(equipmentDetails.getStatus());
            equipment.setLocation(equipmentDetails.getLocation());
            equipment.setLastMaintenanceDate(equipmentDetails.getLastMaintenanceDate());
            return equipmentRepository.save(equipment);
        } else {
            return null; // or throw an exception
        }
    }
}
