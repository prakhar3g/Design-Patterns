package AtmMachine;

import AtmMachine.enums.OperationType;

public class Main {

    public static void main(String[] args) {
        ATMController atmController = new ATMController();
        ATM atm = atmController.getAtm();
        Card card = atmController.getUser().getCard();

        System.out.println("Current Status of atm:");
        atm.currentAtmStatus();

        System.out.println("Atm working");
        atm.getAtmState().insertCard(atm,card);
        atm.getAtmState().authenticatePin(atm,card,"12345");
       // atm.getAtmState().selectOperation(atm,card, OperationType.CASH_WITHDRAWAL);
       // atm.getAtmState().cashWithdrawal(atm,card, BigDecimal.valueOf(2500));
        atm.getAtmState().selectOperation(atm,card, OperationType.CHECK_BALANCE);
        atm.getAtmState().checkBalance(atm,card);
        atm.currentAtmStatus();
    }
}
