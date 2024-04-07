package SplitWiseApplication.expense;

import SplitWiseApplication.user.User;

import java.util.List;
import java.util.Map;

public interface SplitExpense {

    List<Split> validateAndCreateSplits(Map<User, Double> userAmountMap, double totalAmount);
}
