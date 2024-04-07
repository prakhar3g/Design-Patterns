package VechileRentalSystem.service;

import VechileRentalSystem.entities.Status;
import VechileRentalSystem.entities.Vehicle;
import VechileRentalSystem.entities.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VehicleInventoryManagementSystem {

    private List<Vehicle> vehicleList=new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public boolean removeVehicle(int vehicleNumber){
        for (Vehicle vehicle:vehicleList){
            if (vehicle.getVehicleNumber() == vehicleNumber){
                vehicleList.remove(vehicle);
                return true;
            }
        }
        return false;
    }

    public void updateVehicle(Vehicle vehicle){

    }

    public Vehicle getVehicle(int VehicleNumber){
        for (Vehicle vehicle:vehicleList){
            if (vehicle.getVehicleNumber() == VehicleNumber){
               return vehicle;
            }
        }
        return null;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getAvailableVehicles(VehicleType vehicleType){
        List<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle vehicle:vehicleList){
            if (vehicle.getStatus().equals(Status.ACTIVE) && vehicle.getVehicleType().equals(vehicleType)){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }

}
