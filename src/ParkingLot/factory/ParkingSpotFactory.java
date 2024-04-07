package ParkingLot.factory;

import ParkingLot.entities.FourWheelerParkingSpot;
import ParkingLot.entities.ParkingSpot;
import ParkingLot.entities.ThreeWheelerParkingSpot;
import ParkingLot.entities.TwoWheelerParkingSpot;
import ParkingLot.enums.ParkingType;

public class ParkingSpotFactory {

    private TwoWheelerParkingSpot twoWheelerParkingSpot;
    private ThreeWheelerParkingSpot threeWheelerParkingSpot;
    private FourWheelerParkingSpot fourWheelerParkingSpot;

    public ParkingSpot getParkingSpot(ParkingType parkingType){
        if (parkingType.equals(ParkingType.TWO_WHEELER)) {
            return new TwoWheelerParkingSpot(false,null,parkingType);
        } else if (parkingType.equals(ParkingType.THREE_WHEELER)) {
            return new ThreeWheelerParkingSpot(false,null,parkingType);
        } else if (parkingType.equals(ParkingType.FOUR_WHEELER)) {
            return new FourWheelerParkingSpot(false,null,parkingType);
        }
        return null;
    }
}
