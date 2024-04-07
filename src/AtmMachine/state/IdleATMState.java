package AtmMachine.state;

import AtmMachine.ATM;
import AtmMachine.Card;

public class IdleATMState extends ATMState{

    @Override
    public void insertCard(ATM atm, Card card){
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());
    }
}
