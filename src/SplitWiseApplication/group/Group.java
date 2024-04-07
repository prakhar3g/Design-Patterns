package SplitWiseApplication.group;

import SplitWiseApplication.expense.Expense;
import SplitWiseApplication.expense.ExpenseController;
import SplitWiseApplication.expense.Split;
import SplitWiseApplication.expense.SplitType;
import SplitWiseApplication.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {
    private String groupId;
    private String groupName;
    private List<User> groupMember;
    private List<Expense> groupExpenses;
    private ExpenseController expenseController;

    public Group(String groupName) {
        this.groupId = UUID.randomUUID().toString();
        this.groupName = groupName;
        groupMember = new ArrayList<>();
        groupExpenses = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void addMember(User member) {
        groupMember.add(member);
    }

    public void addExpense(String description, double expenseAmount, List<Split> splitDetails, SplitType splitType, User paidByUser) {
        Expense expense = expenseController.createExpense(description,expenseAmount,splitDetails,splitType,paidByUser);
        groupExpenses.add(expense);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(List<User> groupMember) {
        this.groupMember = groupMember;
    }

    public List<Expense> getGroupExpenses() {
        return groupExpenses;
    }

    public void setGroupExpenses(List<Expense> groupExpenses) {
        this.groupExpenses = groupExpenses;
    }

    public ExpenseController getExpenseController() {
        return expenseController;
    }

    public void setExpenseController(ExpenseController expenseController) {
        this.expenseController = expenseController;
    }
}
