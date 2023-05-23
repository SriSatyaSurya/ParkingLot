package com.parkinglot.vehicle;

import com.parkinglot.size.VehicleSize;

//RV class (inherits Vehicle)
public class RV extends Vehicle {
 public RV(String licensePlate) {
     super(licensePlate);
 }
 
 @Override
 public VehicleSize getVehicleSize() {
     return VehicleSize.DOUBLE_EXTRA_LARGE;
 }
}