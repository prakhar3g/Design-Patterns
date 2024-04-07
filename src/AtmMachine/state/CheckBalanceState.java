package AtmMachine.state;

import AtmMachine.ATM;
import AtmMachine.Card;

public class CheckBalanceState extends ATMState{

    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("Your Balance is "+card.getBankAccount().getBalance());
        exitAtm(atm);
    }

    @Override
    public void exitAtm(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleATMState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
