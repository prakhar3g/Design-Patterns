package SplitWiseApplication;

import SplitWiseApplication.balanceSheet.UserExpenseBalanceSheetController;
import SplitWiseApplication.expense.ExpenseController;
import SplitWiseApplication.expense.Split;
import SplitWiseApplication.expense.SplitType;
import SplitWiseApplication.group.GroupController;
import SplitWiseApplication.user.User;
import SplitWiseApplication.user.UserController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitWise {
    private UserController userController;
    private GroupController groupController;
    private ExpenseController expenseController;
    private UserExpenseBalanceSheetController userExpenseBalanceSheetController;

    public SplitWise() {
        userController = new UserController();
        groupController = new GroupController();
        expenseController = new ExpenseController();
        userExpenseBalanceSheetController = new UserExpenseBalanceSheetController();
    }

    public void demo() {
        //creating Users
        User user1 = new User("Prakhar","prakhar3g");
        User user2 = new User("Ashu","ashu.shakya");
        User user3 = new User("Eshan","eshan.jain");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);

        //Creating Group;
        groupController.createNewGroup("Friends",user1);
        groupController.getGroup("Friends").addMember(user2);
        groupController.getGroup("Friends").addMember(user3);

        //First Expense
        Map<User,Double> userSplitMap1 = new HashMap<>();
        userSplitMap1.put(user1,0.0);
        userSplitMap1.put(user2,0.0);
        userSplitMap1.put(user3,0.0);
        List<Split> splits = expenseController.validateAndCreateSplits(userSplitMap1,900,SplitType.EQUAL);
        groupController.getGroup("Friends").addExpense("Trip", 900, splits, SplitType.EQUAL, user1);


        //Second Expense
        double totalExpense = 500;
        Map<User,Double> userSplitMap = new HashMap<>();
        userSplitMap.put(user1,400.0);
        userSplitMap.put(user2,100.0);
        List<Split> splitList = expenseController.validateAndCreateSplits(userSplitMap,totalExpense,SplitType.UNEQUAL);
        groupController.getGroup("Friends").addExpense("Trip",500,splitList, SplitType.UNEQUAL,user2);

        for (User user: userController.getAllUsers()) {
            userExpenseBalanceSheetController.displayUserExpenseBalanceSheet(user);
        }
    }
}
