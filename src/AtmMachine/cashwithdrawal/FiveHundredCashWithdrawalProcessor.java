package AtmMachine.cashwithdrawal;

import AtmMachine.ATM;

import java.math.BigDecimal;

public class FiveHundredCashWithdrawalProcessor extends CashWithdrawalProcessor{

    public FiveHundredCashWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdrawMoney(ATM atm, BigDecimal remainingAmount) {
        int requiredNumberOfNotes = remainingAmount.intValue()/500;
        BigDecimal remainingBalance = remainingAmount.remainder(BigDecimal.valueOf(500));
        if (requiredNumberOfNotes<= atm.getNoOfFiveHundredNotes()) {
            atm.setNoOfFiveHundredNotes(atm.getNoOfFiveHundredNotes()-requiredNumberOfNotes);
        }else {
            remainingBalance = remainingBalance.add(BigDecimal.valueOf((requiredNumberOfNotes-atm.getNoOfFiveHundredNotes())*500));
            atm.setNoOfFiveHundredNotes(0);
        }
        if (remainingBalance.compareTo(BigDecimal.ZERO)>0) {
            super.withdrawMoney(atm,remainingBalance);
        }
    }
}
