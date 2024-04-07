package vendingmachine.vendingstate;

import vendingmachine.*;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine machine , Coin coin) throws Exception;

    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;

    public void selectProduct(VendingMachine vendingMachine,int productCode) throws Exception;

    public int getChange(int returnExtraMoney) throws Exception;

    public Item dispenseItem(VendingMachine vendingMachine,int productCode) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
}
