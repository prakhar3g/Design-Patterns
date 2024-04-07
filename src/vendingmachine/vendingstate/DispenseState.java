package vendingmachine.vendingstate;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;

import java.util.List;

public class DispenseState implements State{

    public DispenseState(int itemCode,VendingMachine vendingMachine) throws Exception {
        System.out.println("---In Dispense State---");
        dispenseItem(vendingMachine,itemCode);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Dispense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert coin button in Dispense state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on select product button in Dispense state");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int itemCode) throws Exception {
        throw new Exception("you can not select product button in Dispense state");
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        throw new Exception("you can not get change in Dispense state");
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine, int itemCode) throws Exception {
        System.out.println("Dispensing Item with itemCode- " + itemCode);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getInventory().getItem(itemCode);
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not select product button in refund Money state");
    }
}
