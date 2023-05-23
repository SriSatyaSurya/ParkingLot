package com.parkinglot.vehicle;

import com.parkinglot.size.VehicleSize;

// Motorcycle class (inherits Vehicle)
public class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }
    
    @Override
    public VehicleSize getSize() {
        return VehicleSize.MOTORCYCLE;
    }
}