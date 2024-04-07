package SplitWiseApplication.expense;

import SplitWiseApplication.balanceSheet.UserExpenseBalanceSheetController;
import SplitWiseApplication.user.User;

import java.util.List;
import java.util.Map;

public class ExpenseController {
    private UserExpenseBalanceSheetController userExpenseBalanceSheetController;
    private SplitExpenseFactory splitExpenseFactory;

    public ExpenseController() {
        userExpenseBalanceSheetController = new UserExpenseBalanceSheetController();
        splitExpenseFactory = new SplitExpenseFactory();
    }

    public Expense createExpense(String description, double expenseAmount,List<Split> splitDetails, SplitType splitType, User paidByUser) {
        Expense expense = new Expense(expenseAmount,description,paidByUser,splitType,splitDetails);
        userExpenseBalanceSheetController.updateUserExpenseBalanceSheet(paidByUser,splitDetails);
        return expense;
    }

    public List<Split> validateAndCreateSplits(Map<User, Double> userAmountMap, double totalAmount,SplitType splitType) {
        return splitExpenseFactory.getSplitExpense(splitType).validateAndCreateSplits(userAmountMap,totalAmount);
    }

}
