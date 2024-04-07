package AtmMachine.state;

import AtmMachine.ATM;
import AtmMachine.Card;
import AtmMachine.cashwithdrawal.CashWithdrawalProcessor;
import AtmMachine.cashwithdrawal.FiveHundredCashWithdrawalProcessor;
import AtmMachine.cashwithdrawal.OneHundredCashWithdrawalProcessor;
import AtmMachine.cashwithdrawal.TwoThousandCashWithdrawalProcessor;

import java.math.BigDecimal;

public class CashWithdrawalState extends ATMState{

    public CashWithdrawalState() {
        System.out.println("Enter Amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, BigDecimal amount) {
        if (atm.getAtmBalance().compareTo(amount) < 0) {
            System.out.println("Insufficient Balance in the atm");
            exitAtm(atm);
        }
        else {
            if (card.getBankAccount().getBalance().compareTo(amount)<0) {
                System.out.println("Insufficient Balance in your bank account");
                exitAtm(atm);
            }
            else {
                card.getBankAccount().deductBalance(amount);
                atm.deductBalance(amount);
                CashWithdrawalProcessor cashWithdrawalProcessor = new TwoThousandCashWithdrawalProcessor(new FiveHundredCashWithdrawalProcessor(new OneHundredCashWithdrawalProcessor(null)));
                cashWithdrawalProcessor.withdrawMoney(atm,amount);
                exitAtm(atm);
            }
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
