package Assignments.A53;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }

        int income = sc.nextInt();

        if (income < 0) {
            System.out.println("invalid input");
            return;
        }

        double totalTax = 0.0;

        if (income <= 250000) {
            totalTax = 0.0;
        } else if (income <= 500000) {
            totalTax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            totalTax = (250000 * 0.05) + (income - 500000) * 0.20;
        } else {
            totalTax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
        }

        System.out.println("Annual Income: ₹" + income);
        System.out.println("Total Tax Payable: ₹" + (totalTax % 1 == 0 ? (int) totalTax : totalTax));

        sc.close();
    }
}