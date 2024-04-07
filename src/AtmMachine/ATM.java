package AtmMachine;

import AtmMachine.state.ATMState;
import AtmMachine.state.IdleATMState;

import java.math.BigDecimal;

public class ATM {

    private ATMState atmState;
    private BigDecimal atmBalance;
    private int noOfTwoThousandNotes;
    private int noOfFiveHundredNotes;
    private int noOfOneHundredNotes;

    public ATM() {
        atmState = new IdleATMState();
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public BigDecimal getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(BigDecimal atmBalance) {
        this.atmBalance = atmBalance;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void deductBalance(BigDecimal amount) {
        atmBalance = atmBalance.subtract(amount);
    }

    public void currentAtmStatus() {
        System.out.println("Atm Balance: "+atmBalance);
        System.out.println("Number of 2000 rupee note: "+noOfTwoThousandNotes);
        System.out.println("Number of 500 rupee note: "+noOfFiveHundredNotes);
        System.out.println("Number of 100 rupee note: "+noOfOneHundredNotes);
    }
}
