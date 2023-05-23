package com.parkinglot.vehicle;

import com.parkinglot.size.VehicleSize;

//RV class (inherits Vehicle)
public class Boat extends Vehicle {
public Boat(String licensePlate) {
   super(licensePlate);
}

@Override
public VehicleSize getSize() {
   return VehicleSize.EXTRA_LARGE;
}
}