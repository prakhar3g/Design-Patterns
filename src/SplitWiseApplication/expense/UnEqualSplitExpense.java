package SplitWiseApplication.expense;

import SplitWiseApplication.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnEqualSplitExpense implements SplitExpense {

    @Override
    public List<Split> validateAndCreateSplits(Map<User, Double> userAmountMap, double totalAmount) {
        double currentAmount = 0;
        for (Map.Entry<User, Double> entry : userAmountMap.entrySet()) {
            currentAmount += entry.getValue().doubleValue();
        }

        if (currentAmount != totalAmount) {
            System.out.print("Sum of each split amount is not equal to totalAmount, Try Again");
            return null;
        }
        if (currentAmount == totalAmount) {
            List<Split> splitList = new ArrayList<>();
            for (Map.Entry<User, Double> entry : userAmountMap.entrySet()) {
                User user = entry.getKey();
                double amount = entry.getValue().doubleValue();
                Split split = new Split(user, amount);
                splitList.add(split);
            }
            return splitList;
        }
        return null;
    }
}
