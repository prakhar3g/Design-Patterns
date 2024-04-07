package SplitWiseApplication.balanceSheet;

import SplitWiseApplication.expense.Split;
import SplitWiseApplication.user.User;

import java.util.List;
import java.util.Map;

public class UserExpenseBalanceSheetController {

    public void updateUserExpenseBalanceSheet(User paidByUser, List<Split> splitDetails) {
        for (Split split:splitDetails) {
            User userOwed = split.getUser();
            double amount = split.getAmount();
            UserExpenseBalanceSheet userExpenseBalanceSheet = userOwed.getUserExpenseBalanceSheet();
            if (userOwed.getUserName().equals(paidByUser.getUserName())) {
                userExpenseBalanceSheet.setTotalYourExpense(userExpenseBalanceSheet.getTotalYourExpense()+amount);
            }else {
                paidByUser.getUserExpenseBalanceSheet().setTotalYouGetBack(paidByUser.getUserExpenseBalanceSheet().getTotalYouGetBack()+amount);

                Balance paidUserGetBack;
                if (paidByUser.getUserExpenseBalanceSheet().getUserVsBalance().containsKey(userOwed.getUserName())) {
                    paidUserGetBack = paidByUser.getUserExpenseBalanceSheet().getUserVsBalance().get(userOwed.getUserName());
                }
                else {
                    paidUserGetBack = new Balance();
                    paidByUser.getUserExpenseBalanceSheet().getUserVsBalance().put(userOwed.getUserName(),paidUserGetBack);
                }
                paidUserGetBack.setAmountGetBack(paidUserGetBack.getAmountGetBack()+amount);

               userExpenseBalanceSheet.setTotalYourExpense(userExpenseBalanceSheet.getTotalYourExpense()+amount);
               userExpenseBalanceSheet.setTotalYouOwe(userExpenseBalanceSheet.getTotalYouOwe()+amount);

               Balance userOweBalance;
               if (userExpenseBalanceSheet.getUserVsBalance().containsKey(paidByUser.getUserName())) {
                    userOweBalance = userExpenseBalanceSheet.getUserVsBalance().get(paidByUser.getUserName());
               }else {
                   userOweBalance = new Balance();
                   userExpenseBalanceSheet.getUserVsBalance().put(paidByUser.getUserName(),userOweBalance);
               }
               userOweBalance.setAmountOwe(amount);
            }
        }
    }

    public void displayUserExpenseBalanceSheet(User user) {
        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getUserName());
        UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();

        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalYourExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalYouOwe());
        for(Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getUserVsBalance().entrySet()){
            String userID = entry.getKey();
            Balance balance = entry.getValue();
            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
        }
        System.out.println("---------------------------------------");
    }
}
