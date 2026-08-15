package Assignments.A52;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int balance = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int withdrawAmount = sc.nextInt();

        if (balance < 0 || withdrawAmount <= 0) {
            System.out.println("invalid input");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("Transaction Failed: Amount must be a multiple of ₹100");
        } else if (withdrawAmount > 25000) {
            System.out.println("Transaction Failed: Maximum withdrawal limit is ₹25,000");
        } else if (balance - withdrawAmount < 1000) {
            System.out.println("Transaction Failed: Minimum balance of ₹1,000 must be maintained");
        } else {
            int newBalance = balance - withdrawAmount;
            System.out.println("Transaction Successful.");
            System.out.println("Remaining Balance: ₹" + newBalance);
        }

        sc.close();
    }
}
