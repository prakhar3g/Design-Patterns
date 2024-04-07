package AtmMachine;

import java.util.Date;

public class Card {
    private String cardNumber;
    private int cvv;
    private Date expiryDate;
    private String cardHolderName;
    private String PIN = "12345";
    private BankAccount bankAccount;

    public Card(String cardNumber, int cvv, Date expiryDate, String cardHolderName, BankAccount bankAccount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.cardHolderName = cardHolderName;
        this.bankAccount = bankAccount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean isPinCorrect(String pin) {
        return pin.equals(PIN);
    }
}
