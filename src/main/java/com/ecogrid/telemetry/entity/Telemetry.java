package com.ecogrid.telemetry.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Telemetry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long prosumerId;
    private double solarGeneration;
    private double energyConsumption;
    private String timestamp;

    public Telemetry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProsumerId() {
        return prosumerId;
    }

    public void setProsumerId(Long prosumerId) {
        this.prosumerId = prosumerId;
    }

    public double getSolarGeneration() {
        return solarGeneration;
    }

    public void setSolarGeneration(double solarGeneration) {
        this.solarGeneration = solarGeneration;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}