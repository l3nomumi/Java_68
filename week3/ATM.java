package week3;

import week3.BankAccount;

public class ATM {

    private BankAccount account;

    
    public ATM(BankAccount account) {
        this.account = account;
    }

    
    public void checkBalance() {
        System.out.println("ยอดเงินคงเหลือ: " + account.getBalance() + " บาท");
    }

    
    public void depositMoney(double amount) {
        account.deposit(amount);
    }

    
    public void withdrawMoney(double amount) {
        account.withdraw(amount);
    }

    
    public void showAccountInfo() {
        account.showInfo();
    }

    public boolean checkAcccount( String accountNo, int pin ){
        return account.AuthAccuount(accountNo, pin);
    }

}
