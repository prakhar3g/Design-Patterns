package vendingmachine.vendingstate;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;

import java.util.List;

public class CollectMoneyState implements State {

    public CollectMoneyState(){
        System.out.println("Currently Vending machine is in CollectMoneyState");
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        vendingMachine.getCoins().add(coin);
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("You cannot select product in CollectMoney State");
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        throw new Exception("You cannot change money in CollectMoney State");
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("You cannot dispense product in CollectMoney State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoins();
    }
}
