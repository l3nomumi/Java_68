package week3;

public class BankAccount {

    private String accountNo;
    private String ownerName;
    private double balance;
    private int pin;

    public BankAccount(String accountNo, String ownerName, double balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public boolean AuthAccuount(String accountNo, int pin) {

    if (accountNo.equals("001-COMSCI-001")) {
        if (pin == 1234) {
            return true;
        } else {
            return false;
        }
    } 
    else if (accountNo.equals("001-COMSCI-002")) {
        if (pin == 1111) {
            return true;
        } else {
            return false;
        }
    } 
    else if (accountNo.equals("001-COMSCI-003")) {
        if (pin == 2222) {
            return true;
        } else {
            return false;
        }
    } 
    else if (accountNo.equals("001-COMSCI-004")) {
        if (pin == 3333) {
            return true;
        } else {
            return false;
        }
    } 
    else if (accountNo.equals("001-COMSCI-005")) {
        if (pin == 4444) {
            return true;
        } else {
            return false;
        }
    } 
    else {
        return false;
    }
}

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // ฝากเงิน
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("ฝากเงินสำเร็จ: " + amount + " บาท");
        } else {
            System.out.println("จำนวนเงินฝากไม่ถูกต้อง");
        }
    }

    // ถอนเงิน
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("จำนวนเงินถอนไม่ถูกต้อง");
        } else if (amount > balance) {
            System.out.println("ยอดเงินในบัญชีไม่เพียงพอ");
        } else {
            balance -= amount;
            System.out.println("ถอนเงินสำเร็จ: " + amount + " บาท");
        }
    }

    public void showInfo() {
        System.out.println("เลขที่บัญชี: " + accountNo);
        System.out.println("ชื่อเจ้าของบัญชี: " + ownerName);
        System.out.println("ยอดเงินคงเหลือ: " + balance + " บาท");
    }
}