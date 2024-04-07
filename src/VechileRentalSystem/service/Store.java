package VechileRentalSystem.service;

import VechileRentalSystem.entities.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class Store {
    private int storeId;
    private VehicleInventoryManagementSystem vehicleInventoryManagementSystem;
    private Location location;
    private List<Reservation> reservationList=new ArrayList<>();


    public Store(int storeId, VehicleInventoryManagementSystem vehicleInventoryManagementSystem, Location location) {
        this.storeId = storeId;
        this.vehicleInventoryManagementSystem = vehicleInventoryManagementSystem;
        this.location = location;
    }

    public Reservation createReservation(User user, Vehicle vehicle, LocalDateTime pickupTime,LocalDateTime dropTime,Location pickupLocation,Location dropLocation){
        Reservation reservation = new Reservation(UUID.randomUUID().toString(),user,vehicle,pickupTime,dropTime,pickupLocation,dropLocation, ReservationStatus.SCHEDULED);
        vehicle.setStatus(Status.BOOKED);
        reservationList.add(reservation);
        return reservation;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public VehicleInventoryManagementSystem getVehicleInventoryManagementSystem() {
        return vehicleInventoryManagementSystem;
    }

    public void setVehicleInventoryManagementSystem(VehicleInventoryManagementSystem vehicleInventoryManagementSystem) {
        this.vehicleInventoryManagementSystem = vehicleInventoryManagementSystem;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", vehicleInventoryManagementSystem=" + vehicleInventoryManagementSystem +
                ", location=" + location +
                ", reservationList=" + reservationList +
                '}';
    }
}
