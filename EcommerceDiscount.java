package Assignments.A52;

import java.util.Scanner;

public class EcommerceDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int amount = sc.nextInt();

        if (!sc.hasNext()) {
            System.out.println("invalid input");
            return;
        }
        String membership = sc.next();

        if (amount <= 0 || (!membership.equalsIgnoreCase("Premium") && !membership.equalsIgnoreCase("Regular"))) {
            System.out.println("invalid input");
            return;
        }

        double mainDiscountRate = 0.0;
        if (amount > 5000) {
            mainDiscountRate = 0.20;
        } else if (amount > 2000) {
            mainDiscountRate = 0.10;
        }

        double mainDiscount = amount * mainDiscountRate;
        double discountedAmount = amount - mainDiscount;

        double extraDiscount = 0.0;
        if (membership.equalsIgnoreCase("Premium")) {
            extraDiscount = discountedAmount * 0.05;
        }

        double totalDiscount = mainDiscount + extraDiscount;
        double finalAmount = amount - totalDiscount;

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Total Discount: ₹" + totalDiscount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);

        sc.close();
    }
}