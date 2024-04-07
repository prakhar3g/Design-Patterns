package VechileRentalSystem;

import VechileRentalSystem.entities.*;
import VechileRentalSystem.service.Store;
import VechileRentalSystem.service.VehicleInventoryManagementSystem;
import VechileRentalSystem.service.VehicleRentalSystem;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("----VEHICLE RENTAL SYSTEM----");

        User user = new User("Prakhar","1","DL21");

        Location location = new Location("Bellandur","Bengaluru","Karnataka","560103");
        VehicleInventoryManagementSystem vehicleInventoryManagementSystem = new VehicleInventoryManagementSystem();
        Store store = new Store(1,vehicleInventoryManagementSystem,location);
        Vehicle vehicle1 = new Vehicle(1,"swift", VehicleType.CAR, Status.ACTIVE);
        Vehicle vehicle2 = new Vehicle(2,"brezza", VehicleType.CAR, Status.ACTIVE);
        vehicleInventoryManagementSystem.addVehicle(vehicle1);
        vehicleInventoryManagementSystem.addVehicle(vehicle2);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        vehicleRentalSystem.addStore(store);
        vehicleRentalSystem.addUser(user);

        System.out.println("----User Came to search");
        System.out.println("----List Store of Bellandur");
        Location newlocation = new Location("Bellandur","Bengaluru","Karnataka","560103");
        Store bellandurStore = vehicleRentalSystem.getStore(newlocation);
        System.out.println(bellandurStore.toString());
        System.out.println("----List Car of that stores---");
        for (Vehicle vehicle:bellandurStore.getVehicleInventoryManagementSystem().getAvailableVehicles(VehicleType.CAR)){
            System.out.println(vehicle.toString());
        }
        LocalDateTime pickupTime = LocalDateTime.of(2023,05,20,6,00,00);
        LocalDateTime dropTime  = LocalDateTime.of(2023,05,21,6,00,00);
        Location pickupLocation = new Location("Bellandur","Bengaluru","Karnataka","560103");

        Location dropLocation = new Location("Bellandur","Bengaluru","Karnataka","560103");
        Reservation reservation =bellandurStore.createReservation(user,vehicle1,pickupTime,dropTime,pickupLocation,dropLocation);

        Bill bill = new Bill(reservation,new DailyBillStrategy());
        System.out.println(bill.toString());

        Payment payment = new Cash(bill,PaymentMode.CASH);
        payment.madePayment();

        for (Vehicle vehicle:bellandurStore.getVehicleInventoryManagementSystem().getAvailableVehicles(VehicleType.CAR)){
            System.out.println(vehicle.toString());
        }
    }
}
