package AtmMachine.state;

import AtmMachine.ATM;
import AtmMachine.Card;
import AtmMachine.enums.OperationType;

public class SelectionState extends ATMState{

    @Override
    public void selectOperation(ATM atm, Card card, OperationType operationType) {
        switch (operationType){
            case CASH_WITHDRAWAL:
                atm.setAtmState(new CashWithdrawalState());
                break;
            case CHECK_BALANCE:
                atm.setAtmState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Option");
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
