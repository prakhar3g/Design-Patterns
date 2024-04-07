package vendingmachine.vendingstate;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;

import java.util.List;

public class SelectionState implements State{

    public SelectionState() {
        System.out.println("In Selection State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you cannot inset coin in Selection state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int itemCode) throws Exception {
        int totalMoneyPaidByUser = 0;
        for (Coin coin: vendingMachine.getCoins()) {
            totalMoneyPaidByUser += coin.value;
        }

        Item item = vendingMachine.getInventory().getItem(itemCode);

        if (item.isSoldOut()) {
            refundFullMoney(vendingMachine);
            throw new Exception("Item is sold Out");
        }

        if (totalMoneyPaidByUser < item.getPrice()) {
            System.out.println("Insufficient Money, Refunding all money");
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient Money, Refunding all money");
        }

        if (item.getPrice() < totalMoneyPaidByUser) {
            getChange(totalMoneyPaidByUser - item.getPrice());
        }

        vendingMachine.getInventory().reduceItemUnits(item);
        vendingMachine.setVendingMachineState(new DispenseState(itemCode,vendingMachine));
    }

    @Override
    public int getChange(int returnExtraMoney) {
        System.out.println("Returning change to user, "+ returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("You cannot dispense product in Selection State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoins();
    }
}
