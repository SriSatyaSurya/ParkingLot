package com.parkinglot.size;
// VehicleSize enum to represent different spot sizes
public enum VehicleSize {
    MOTORCYCLE(1),
    COMPACT(2),
    LARGE(5),
    EXTRA_LARGE(7), 
	DOUBLE_EXTRA_LARGE(9);
	
    private int size;
    
    private VehicleSize(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
}