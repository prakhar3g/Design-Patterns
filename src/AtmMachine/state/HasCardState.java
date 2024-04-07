package AtmMachine.state;

import AtmMachine.ATM;
import AtmMachine.Card;

public class HasCardState extends ATMState{

    @Override
    public void authenticatePin(ATM atm, Card card, String pin){
        if (card.isPinCorrect(pin)) {
            atm.setAtmState(new SelectionState());
        } else {
            System.out.println("Incorrect Pin");
            exitAtm(atm);
        }
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
