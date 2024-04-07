package AtmMachine.cashwithdrawal;

import AtmMachine.ATM;

import java.math.BigDecimal;
import java.text.Bidi;

public abstract class CashWithdrawalProcessor {

    protected CashWithdrawalProcessor nextProcessor;

    public CashWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void withdrawMoney(ATM atm, BigDecimal remainingAmount){
        if (nextProcessor!=null) {
            nextProcessor.withdrawMoney(atm,remainingAmount);
        }
    }
}
