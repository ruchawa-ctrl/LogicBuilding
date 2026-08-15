package Assignments.A56;

import java.util.Scanner;

public class HotelBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }

        int days = sc.nextInt();

        if (days < 0) {
            System.out.println("invalid input");
            return;
        }

        double totalBill = days * 3000.0;

        if (days > 7) {
            totalBill -= totalBill * 0.05;
        }

        System.out.println("Total Stay Duration: " + days + " days");
        System.out.println("Final Bill Amount: ₹" + (totalBill % 1 == 0 ? (int) totalBill : totalBill));

        sc.close();
    }
}