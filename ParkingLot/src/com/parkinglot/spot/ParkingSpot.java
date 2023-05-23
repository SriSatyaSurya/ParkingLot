package com.parkinglot.spot;
import com.parkinglot.vehicle.Vehicle;
import com.parkinglot.size.VehicleSize;

// ParkingSpot class
class ParkingSpot {
    private VehicleSize size;
    private Vehicle currentVehicle;
    
    public ParkingSpot(VehicleSize size) {
        this.size = size;
    }
    
    public boolean canFitVehicle(Vehicle vehicle) {
        return currentVehicle == null && size.getSize() >= vehicle.getSize().getSize();
    }
    
    public boolean parkVehicle(Vehicle vehicle) {
        if (!canFitVehicle(vehicle)) {
            return false;
        }
        this.currentVehicle = vehicle;
        return true;
    }
    
    public void removeVehicle() {
        this.currentVehicle = null;
    }
    
    public boolean isOccupied() {
        return currentVehicle != null;
    }
    
    public VehicleSize getSize() {
        return size;
    }
    
    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }
}