package com.parkinglot.vehicle;

import com.parkinglot.size.VehicleSize;

// Vehicle class (abstract)
public abstract class Vehicle {
    private String licensePlate;
    // Add any other common attributes or methods here
    
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    public abstract VehicleSize getVehicleSize();
}
