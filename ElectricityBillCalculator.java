package Assignments.A52;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }

        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("invalid input");
            return;
        }

        int totalBill = 0;

        if (units <= 100) {
            totalBill = units * 5;
        } else if (units <= 200) {
            totalBill = (100 * 5) + (units - 100) * 7;
        } else {
            totalBill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }

        System.out.println("Total Units Consumed: " + units);
        System.out.println("Total Electricity Bill: ₹" + totalBill);

        sc.close();
    }
}