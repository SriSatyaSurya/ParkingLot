package com.parkinglot.vehicle;

import com.parkinglot.size.VehicleSize;

// Bus class (inherits Vehicle)
public class Bus extends Vehicle {
    public Bus(String licensePlate) {
        super(licensePlate);
    }
    
    @Override
    public VehicleSize getSize() {
        return VehicleSize.LARGE;
    }
}