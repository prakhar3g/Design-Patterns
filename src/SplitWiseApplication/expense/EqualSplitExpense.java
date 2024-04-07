package SplitWiseApplication.expense;

import SplitWiseApplication.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EqualSplitExpense implements SplitExpense{

    public List<Split> validateAndCreateSplits(Map<User, Double> userAmountMap, double totalAmount) {
        double individualExpense = totalAmount/userAmountMap.size();
        List<Split> splits = new ArrayList<>();
        for (Map.Entry<User,Double> entry:userAmountMap.entrySet()) {
            User user = entry.getKey();
            Split split = new Split(user,individualExpense);
            splits.add(split);
        }
        return splits;
    }
}
