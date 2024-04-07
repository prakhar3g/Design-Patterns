package AtmMachine.cashwithdrawal;

import AtmMachine.ATM;

import java.math.BigDecimal;

public class OneHundredCashWithdrawalProcessor extends CashWithdrawalProcessor{

    public OneHundredCashWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdrawMoney(ATM atm, BigDecimal remainingAmount) {
        int requiredNumberOfNotes = remainingAmount.intValue()/100;
        BigDecimal remainingBalance = remainingAmount.remainder(BigDecimal.valueOf(100));
        if (requiredNumberOfNotes<= atm.getNoOfOneHundredNotes()) {
            atm.setNoOfOneHundredNotes(atm.getNoOfOneHundredNotes()-requiredNumberOfNotes);
        }else {
            remainingBalance = remainingBalance.add(BigDecimal.valueOf((requiredNumberOfNotes-atm.getNoOfOneHundredNotes())*500));
            atm.setNoOfOneHundredNotes(0);
        }
        if (remainingBalance.compareTo(BigDecimal.ZERO)>0) {
            super.withdrawMoney(atm,remainingBalance);
        }
    }
}
