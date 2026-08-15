package Assignments.A54;

import java.util.Scanner;

public class StoreBudgetProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int budget = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int n = sc.nextInt();

        if (budget < 0 || n < 0) {
            System.out.println("invalid input");
            return;
        }

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("invalid input");
                return;
            }
            prices[i] = sc.nextInt();
            if (prices[i] <= 0) {
                System.out.println("invalid input");
                return;
            }
        }

        int itemsPurchased = 0;
        int remainingBalance = budget;

        for (int price : prices) {
            if (remainingBalance >= price) {
                remainingBalance -= price;
                itemsPurchased++;
            } else {
                break;
            }
        }

        System.out.println("Items Purchased: " + itemsPurchased);
        System.out.println("Remaining Balance: ₹" + remainingBalance);

        sc.close();
    }
}