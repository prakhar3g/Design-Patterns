package vendingmachine;

import vendingmachine.vendingstate.IdleState;
import vendingmachine.vendingstate.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private State vendingMachineState;
    private List<Coin> coins;
    private Inventory inventory;

    public VendingMachine() {
        inventory = new Inventory();
        setInventory();
        vendingMachineState = new IdleState();
        coins = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setInventory() {
        int numberOfItems = 10;
        int startProductCode = 100;
        for (int i=1;i<=numberOfItems;i++) {
            inventory.addItem(startProductCode+i,5*i,10);
        }
    }
}
