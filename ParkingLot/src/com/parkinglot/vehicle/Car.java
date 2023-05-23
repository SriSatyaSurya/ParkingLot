package com.parkinglot.vehicle;

import com.parkinglot.size.VehicleSize;

// Car class (inherits Vehicle)
public class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate);
    }
    
    @Override
    public VehicleSize getSize() {
        return VehicleSize.COMPACT;
    }
}