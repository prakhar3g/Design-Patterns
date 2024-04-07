package SplitWiseApplication.expense;

import SplitWiseApplication.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Expense {

    private String expenseId;
    private String description;
    private double expenseAmount;
    private User paidByUser;
    private SplitType splitType;
    List<Split> splitDetails = new ArrayList<>();

    public Expense(double expenseAmount, String description,
                   User paidByUser, SplitType splitType, List<Split> splitDetails) {
        this.expenseId = UUID.randomUUID().toString();
        this.expenseAmount = expenseAmount;
        this.description = description;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails.addAll(splitDetails);

    }


}
