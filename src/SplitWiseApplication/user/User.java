package SplitWiseApplication.user;

import SplitWiseApplication.balanceSheet.UserExpenseBalanceSheet;

public class User {
    private String name;
    private String userName;
    private UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String name, String userName) {
        this.name = name;
        this.userName = userName;
        userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

    public void setUserExpenseBalanceSheet(UserExpenseBalanceSheet userExpenseBalanceSheet) {
        this.userExpenseBalanceSheet = userExpenseBalanceSheet;
    }
}
