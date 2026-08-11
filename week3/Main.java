package week3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu, pinCode;
        double amount;
        String accountNo;

        BankAccount account = new BankAccount(
                "001-COMSCI-001",
                "Bruno",
                99
        );

        ATM atm = new ATM(account);

        System.out.print("เลขบัญชี : ");
        accountNo = sc.nextLine();

        System.out.print("PIN : ");
        pinCode = sc.nextInt();

        if (atm.checkAcccount(accountNo, pinCode)) {

            do {

                System.out.println("\n===== MAIN ATM SYSTEM =====");
                System.out.println("1. แสดงข้อมูลบัญชี");
                System.out.println("2. ฝากเงิน");
                System.out.println("3. ถอนเงิน");
                System.out.println("4. เช็คยอดเงิน");
                System.out.println("0. ออกจากโปรแกรม");
                System.out.print("เลือกเมนู: ");

                menu = sc.nextInt();

                if (menu == 1) {

                    atm.showAccountInfo();

                } else if (menu == 2) {

                    System.out.print("จำนวนเงินที่ต้องการฝาก: ");
                    amount = sc.nextDouble();
                    atm.depositMoney(amount);

                } else if (menu == 3) {

                    System.out.print("จำนวนเงินที่ต้องการถอน: ");
                    amount = sc.nextDouble();
                    atm.withdrawMoney(amount);

                } else if (menu == 4) {

                    atm.checkBalance();

                } else if (menu == 0) {

                    System.out.println("ออกจากโปรแกรมเรียบร้อย");

                } else {

                    System.out.println("เลือกเมนูไม่ถูกต้อง");

                }

            } while (menu != 0);

        } else {

            System.out.println("บัญชีหรือรหัสผ่านไม่ถูกต้อง");

        }

        sc.close();
    }
}