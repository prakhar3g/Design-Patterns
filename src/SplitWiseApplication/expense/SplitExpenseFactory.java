package SplitWiseApplication.expense;

public class SplitExpenseFactory {

    public SplitExpense getSplitExpense(SplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualSplitExpense();
            case UNEQUAL:
                return new UnEqualSplitExpense();
            case PERCENTAGE:
                return new PercentageSplitExpense();
            default:
                return null;
        }
    }
}
