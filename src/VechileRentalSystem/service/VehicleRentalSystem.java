package VechileRentalSystem.service;

import VechileRentalSystem.entities.Location;
import VechileRentalSystem.entities.User;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private List<Store> storeList=new ArrayList<>();
    private List<User> userList=new ArrayList<>();

    public void addStore(Store store){
        storeList.add(store);
    }

    public Store getStore(Location location){
        for (Store store: storeList){
            if (store.getLocation().getPinCode().equals(location.getPinCode())){
                return store;
            }
        }
        return null;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public boolean removeStore(int storeId){
        for (Store store: storeList){
            if (store.getStoreId() == storeId){
                storeList.remove(store);
                return true;
            }
        }
        return false;
    }
}
