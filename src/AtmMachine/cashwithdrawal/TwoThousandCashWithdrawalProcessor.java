package AtmMachine.cashwithdrawal;

import AtmMachine.ATM;

import java.math.BigDecimal;

public class TwoThousandCashWithdrawalProcessor extends CashWithdrawalProcessor {


    public TwoThousandCashWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdrawMoney(ATM atm, BigDecimal remainingAmount){
        int requiredNumberOfNotes = remainingAmount.intValue()/2000;
        BigDecimal remainingBalance = remainingAmount.remainder(BigDecimal.valueOf(2000));
        if (requiredNumberOfNotes<= atm.getNoOfTwoThousandNotes()) {
            atm.setNoOfTwoThousandNotes(atm.getNoOfTwoThousandNotes()-requiredNumberOfNotes);
        }else {
            remainingBalance = remainingBalance.add(BigDecimal.valueOf((requiredNumberOfNotes-atm.getNoOfTwoThousandNotes())*500));
            atm.setNoOfTwoThousandNotes(0);
        }
        if (remainingBalance.compareTo(BigDecimal.ZERO)>0) {
            super.withdrawMoney(atm,remainingBalance);
        }
    }
}
