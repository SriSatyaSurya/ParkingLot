package com.parkinglot.test;
import com.parkinglot.spot.ParkingSpot;
import com.parkinglot.vehicle.Boat;
import com.parkinglot.vehicle.Bus;
import com.parkinglot.vehicle.Car;
import com.parkinglot.vehicle.Motorcycle;
import com.parkinglot.vehicle.RV;
import com.parkinglot.vehicle.Vehicle;
import com.parkinglot.spot.ParkingLot;


public class Driver {
    public static void main(String[] args) {
        // Create a parking lot with 3 levels, 5 rows, and 10 spots per row
//        ParkingLot parkingLot = new ParkingLot(3, 5, 10);
    	
    	int levels=1;
    	int rows=2;
    	int spots=20;
    	if((levels | rows | spots)< 0)
    	{
    		System.out.println("Level/Row/Spot cannot be negative or Zero");
    	}
    	else
    	{
    	ParkingLot parkingLot = new ParkingLot(levels, rows, spots);
    	
        
        // Create some vehicles
//    	Vehicle RV1 = new RV("KFD876");
        Vehicle car1 = new Car("ABC123");
        Vehicle car2 = new Car("DEF456");
        Vehicle bus1 = new Bus("GHI789");
        Vehicle motorcycle1 = new Motorcycle("JKL012");
        Vehicle boat1 = new Boat("HGF675");
        
        
        // Park vehicles in the parking lot
//        boolean success1 = parkingLot.parkVehicle(RV1);
        boolean success2 = parkingLot.parkVehicle(car1);
        boolean success3 = parkingLot.parkVehicle(car2);
        boolean success4 = parkingLot.parkVehicle(bus1);
        boolean success5 = parkingLot.parkVehicle(motorcycle1);
        boolean success6 = parkingLot.parkVehicle(boat1);
        
        
        // Display parking results
//        System.out.println("RV 1 parked successfully: " + success1);
        System.out.println("Car 1 parked successfully: " + success2);
        System.out.println("Car 2 parked successfully: " + success3);
        System.out.println("Bus 1 parked successfully: " + success4);
        System.out.println("Motorcycle 1 parked successfully: " + success5);
        System.out.println("Boat 1 parked successfully: " + success6);
        
        
        // Remove a vehicle from the parking lot
        parkingLot.removeVehicle(car1);
        
        // Try parking a motorcycle in the spot previously occupied by car1
        boolean success7 = parkingLot.parkVehicle(new Motorcycle("MNO345"));
        
        // Display the result of parking the motorcycle
        System.out.println("Motorcycle 2 parked successfully: " + success7);
        
//        ParkingSpot Spot1 = parkingLot.getParkingSpot(0, 0, 0);
//        boolean isSpot1Occupied = Spot1.isOccupied();
//        System.out.println("Is parking spot occupied: " + isSpot1Occupied);
//        
        for (int level = 0; level < levels; level++) {
            for (int row = 0; row < rows; row++) {
                for (int spot = 0; spot < spots; spot++) {
                    ParkingSpot parkingSpot = parkingLot.getParkingSpot(level, row, spot);
                    boolean isOccupied = parkingSpot.isOccupied();
                    System.out.println("Level " + level + ", Row " + row + ", Spot " + spot + " is occupied: " + isOccupied);
                }
            }
        }
    }
    }
}
