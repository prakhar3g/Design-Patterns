package VechileRentalSystem.entities;

import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private User user;
    private Vehicle vehicle;
    private LocalDateTime pickupTime;
    private LocalDateTime dropTime;
    private Location pickupLocation;
    private Location dropLocation;
    private ReservationStatus reservationStatus;

    public Reservation(String reservationId, User user, Vehicle vehicle, LocalDateTime pickupTime, LocalDateTime dropTime, Location pickupLocation, Location dropLocation, ReservationStatus reservationStatus) {
        this.reservationId = reservationId;
        this.user = user;
        this.vehicle = vehicle;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.reservationStatus = reservationStatus;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public LocalDateTime getDropTime() {
        return dropTime;
    }

    public void setDropTime(LocalDateTime dropTime) {
        this.dropTime = dropTime;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId='" + reservationId + '\'' +
                ", user=" + user +
                ", vehicle=" + vehicle +
                ", pickupTime=" + pickupTime +
                ", dropTime=" + dropTime +
                ", pickupLocation=" + pickupLocation +
                ", dropLocation=" + dropLocation +
                ", reservationStatus=" + reservationStatus +
                '}';
    }
}
