package SplitWiseApplication.expense;


import SplitWiseApplication.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PercentageSplitExpense implements SplitExpense{

    @Override
    public List<Split> validateAndCreateSplits(Map<User, Double> userAmountMap, double totalAmount) {
        double percentage = 0;
        for (Map.Entry<User, Double> entry : userAmountMap.entrySet()) {
            percentage += entry.getValue().doubleValue();
        }

        if (percentage != 100.0) {
            System.out.print("Sum of each split percentage is not equal to 100, Try Again");
            return null;
        }

        List<Split> splitList = new ArrayList<>();
        for (Map.Entry<User, Double> entry : userAmountMap.entrySet()) {
            User user = entry.getKey();
            double percent = entry.getValue().doubleValue();
            double amount = (percent*totalAmount)/100;
            Split split = new Split(user,amount);
            splitList.add(split);
        }
        return splitList;
    }
}
