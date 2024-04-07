package AtmMachine;

import java.math.BigDecimal;
import java.util.Date;

public class ATMController {
    private ATM atm;
    private User user;

    public ATMController() {
        initialiseAtm();
        initialiseUser();
    }

    private void initialiseAtm() {
        atm = new ATM();
        atm.setNoOfOneHundredNotes(10);
        atm.setNoOfFiveHundredNotes(8);
        atm.setNoOfTwoThousandNotes(6);
        BigDecimal atmAmount = BigDecimal.valueOf(2000*atm.getNoOfTwoThousandNotes()+500*atm.getNoOfFiveHundredNotes()+100*atm.getNoOfOneHundredNotes());
        atm.setAtmBalance(atmAmount);
    }

    private void initialiseUser() {
        BankAccount bankAccount = createBankAccount();
        Card card = createCard(bankAccount);
        user = new User(bankAccount,card);
    }


    private BankAccount createBankAccount() {
        return new BankAccount("ABCDEF98765",BigDecimal.valueOf(4000),"Ashu");
    }

    private Card createCard(BankAccount bankAccount) {
        return new Card("XYZ12345",987,new Date(),bankAccount.getBankAccountHolderName(),bankAccount);
    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
