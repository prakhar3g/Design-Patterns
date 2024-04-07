package ParkingLot.entities;

import ParkingLot.enums.ParkingType;

public class FourWheelerParkingSpot extends ParkingSpot{

    public FourWheelerParkingSpot(boolean isOccupied, Vehicle vehicle, ParkingType parkingType) {
        super(isOccupied, vehicle, parkingType);
    }
}
