package ParkingLot;

import ParkingLot.entities.*;
import ParkingLot.enums.ParkingType;
import ParkingLot.enums.VehicleType;
import ParkingLot.factory.ParkingSpotFactory;
import ParkingLot.service.ParkingSpotManager;
import ParkingLot.strategy.CostStrategy;
import ParkingLot.strategy.HourlyCostStrategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------Parking Lot---------");
        ParkingSpotFactory parkingSpotFactory =new ParkingSpotFactory();
        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(parkingSpotFactory);

        parkingSpotManager.createParkingSpots(4, ParkingType.TWO_WHEELER);
        parkingSpotManager.createParkingSpots(4, ParkingType.THREE_WHEELER);
        parkingSpotManager.createParkingSpots(4, ParkingType.FOUR_WHEELER);

        EntranceGate entranceGate = new EntranceGate("1",parkingSpotManager);
        ExitGate exitGate = new ExitGate("1",parkingSpotManager);

        Vehicle vehicle1 = new Vehicle("ABC1","White", VehicleType.TWO_WHEELER);
        ParkingSpot parkingSpotTwoWheeler = entranceGate.findParkingSpot(ParkingType.TWO_WHEELER);
        if (null == parkingSpotTwoWheeler) {
            System.out.println("Sorry .... No Parking Space Available");
        }
        entranceGate.bookParkingSpot(parkingSpotTwoWheeler,vehicle1);
        Ticket ticketVehicle1 = entranceGate.generateTicket(vehicle1,parkingSpotTwoWheeler, LocalDateTime.of(2023, 5, 18, 10, 30));
        System.out.println("-----Ticket of Vehicle "+vehicle1.getVehicleNumber()+"-------");
        System.out.println(ticketVehicle1.toString());


        Vehicle vehicle2 = new Vehicle("ABC1","White", VehicleType.THREE_WHEELER);
        ParkingSpot parkingSpotThreeWheeler = entranceGate.findParkingSpot(ParkingType.THREE_WHEELER);
        if (null==parkingSpotThreeWheeler){
            System.out.println("Sorry .... No Parking Space Available");
        }
        entranceGate.bookParkingSpot(parkingSpotThreeWheeler,vehicle2);
        Ticket ticketVehcile2 = entranceGate.generateTicket(vehicle1,parkingSpotTwoWheeler, LocalDateTime.of(2023, 5, 19, 10, 30));
        System.out.println("-----Ticket of Vehicle "+vehicle2.getVehicleNumber()+"-------");
        System.out.println(ticketVehcile2.toString());

        System.out.println("------Occupied Parking Slot------"+parkingSpotManager.getOccupiedParkingSlots());

        CostStrategy costStrategy = new HourlyCostStrategy();
        BigDecimal costVehicle1 = exitGate.calculateCostAndUnparkCar(LocalDateTime.of(2023, 5, 18, 12, 30),ticketVehicle1,costStrategy);
        System.out.println("----Cost of vehicle "+vehicle1.getVehicleNumber()+"  :"+costVehicle1);
        System.out.println("------Occupied Parking Slot------"+parkingSpotManager.getOccupiedParkingSlots());

    }
}
