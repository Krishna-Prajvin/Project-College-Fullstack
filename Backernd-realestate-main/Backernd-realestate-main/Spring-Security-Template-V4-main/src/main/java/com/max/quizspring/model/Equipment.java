package com.max.quizspring.model;

import jakarta.persistence.*;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Equipment {
    @Id
    @Column(unique = true, nullable = false)
    private String equipmentID;
    private String name;
    private String description;
    private String status;
    private String location;
    private Date lastMaintenanceDate;

    public Equipment() {
    }

    public Equipment(String equipmentID, String name, String description, String status, String location, Date lastMaintenanceDate) {
        this.equipmentID = equipmentID;
        this.name = name;
        this.description = description;
        this.status = status;
        this.location = location;
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_id",  nullable = false)
    private User user;

    

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(Date lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
