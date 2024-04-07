package vendingmachine.vendingstate;

import vendingmachine.*;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    public IdleState() {
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("Currently Vending machine is in IdleState");
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new CollectMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }
}
