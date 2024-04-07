package AtmMachine;

import java.math.BigDecimal;

public class BankAccount {
    private String bankAccountNumber;
    private BigDecimal balance;
    private String bankAccountHolderName;

    public BankAccount(String bankAccountNumber, BigDecimal balance, String bankAccountHolderName) {
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public void depositMoney(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Current Balance: "+amount);
    }

    public void deductBalance(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
}
