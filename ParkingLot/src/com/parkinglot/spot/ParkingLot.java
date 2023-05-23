package com.parkinglot.spot;
import com.parkinglot.vehicle.Vehicle;
import com.parkinglot.size.VehicleSize;
// ParkingLot class
public class ParkingLot {
    private int levels;
    private int rows;
    private int spotsPerRow;
    private ParkingSpot[][][] parkingSpots;

    public ParkingLot(int levels, int rows, int spotsPerRow) {
        this.levels = levels;
        this.rows = rows;
        this.spotsPerRow = spotsPerRow;
        this.parkingSpots = new ParkingSpot[levels][rows][spotsPerRow];
        initializeParkingLot();
    }
    
    private void initializeParkingLot() {
        for (int level = 0; level < levels; level++) {
            for (int row = 0; row < rows; row++) {
                for (int spot = 0; spot < spotsPerRow; spot++) {
                    VehicleSize size = determineSize(row);
                    parkingSpots[level][row][spot] = new ParkingSpot(size);
                }
            }
        }
    }
  
    private VehicleSize determineSize(int row) {
        if (row < rows / 4) {
            return VehicleSize.MOTORCYCLE;
        } else if (row < (2 * rows) / 4) {
            return VehicleSize.COMPACT;
        } else if (row < (3 * rows) / 4) {
            return VehicleSize.LARGE;
        } else if (row < (4 * rows) / 4) {
            return VehicleSize.EXTRA_LARGE;
        } else {
            return VehicleSize.DOUBLE_EXTRA_LARGE;
        }
    }
    
    public boolean parkVehicle(Vehicle vehicle) {
        for (int level = 0; level < levels; level++) {
            for (int row = 0; row < rows; row++) {
                for (int spot = 0; spot < spotsPerRow; spot++) {
                    ParkingSpot parkingSpot = parkingSpots[level][row][spot];
                    if (parkingSpot.canFitVehicle(vehicle)) {
                        return parkingSpot.parkVehicle(vehicle);
                    }
                }
            }
        }
        return false;
    }

    public void removeVehicle(Vehicle vehicle) {
        for (int level = 0; level < levels; level++) {
            for (int row = 0; row < rows; row++) {
                for (int spot = 0; spot < spotsPerRow; spot++) {
                    ParkingSpot parkingSpot = parkingSpots[level][row][spot];
                    if (parkingSpot.getCurrentVehicle() == vehicle) {
                        parkingSpot.removeVehicle();
                        return;
                    }
                }
            }
        }
    }
}