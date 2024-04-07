package vendingmachine;

import vendingmachine.vendingstate.State;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
       try {
           displayVendingMachine(vendingMachine);

           State state = vendingMachine.getVendingMachineState();

           System.out.println("------Click on Inset Coin Button------");
           state.clickOnInsertCoinButton(vendingMachine);
           state = vendingMachine.getVendingMachineState();

           System.out.println("------Inserting Coin------");
           state.insertCoin(vendingMachine,Coin.NICKEL);
           state.insertCoin(vendingMachine,Coin.DIME);

           System.out.println("------Click on Select Product Button------");
           state.clickOnSelectProductButton(vendingMachine);

           state = vendingMachine.getVendingMachineState();
           state.selectProduct(vendingMachine,103);

           displayVendingMachine(vendingMachine);

       } catch (Exception e) {
           System.out.println(e.getMessage());
           displayVendingMachine(vendingMachine);
       }
    }

    private static void displayVendingMachine(VendingMachine vendingMachine) {
        for (Item item:vendingMachine.getInventory().getItemList()) {
            System.out.println("CodeNumber: "+item.getItemCode()+" Price: "+item.getPrice() +" NumberOfUnits: "+item.getNumberOfUnits() + " isSoldOut: "+item.isSoldOut());
        }
    }
}
