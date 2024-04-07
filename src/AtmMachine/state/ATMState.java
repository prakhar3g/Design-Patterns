package AtmMachine.state;

import AtmMachine.ATM;
import AtmMachine.Card;
import AtmMachine.enums.OperationType;

import java.math.BigDecimal;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card){
        System.out.println("Something,Went Wrong Please Retry");
    }

    public void authenticatePin(ATM atm, Card card, String pin){
        System.out.println("Something,Went Wrong Please Retry");
    }

    public void selectOperation(ATM atm, Card card, OperationType operationType){
        System.out.println("Something,Went Wrong Please Retry");
    }

    public void cashWithdrawal(ATM atm, Card card, BigDecimal amount){
        System.out.println("Something,Went Wrong Please Retry");
    }

    public void checkBalance(ATM atm, Card card){
        System.out.println("Something,Went Wrong Please Retry");
    }

    public void exitAtm(ATM atm) {
        System.out.println("Something,Went Wrong Please Retry");
    }

    public void returnCard() {
        System.out.println("Something,Went Wrong Please Retry");
    }
}
