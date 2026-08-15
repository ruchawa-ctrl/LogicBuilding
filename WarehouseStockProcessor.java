package Assignments.A53;

import java.util.Scanner;

public class WarehouseStockProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int currentStock = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int requestedQuantity = sc.nextInt();

        if (currentStock < 0 || requestedQuantity <= 0) {
            System.out.println("invalid input");
            return;
        }

        if (requestedQuantity > currentStock) {
            System.out.println("Order Failed: Insufficient Stock.");
        } else {
            int remainingStock = currentStock - requestedQuantity;
            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + remainingStock);

            if (remainingStock < 5) {
                System.out.println("Low Stock Alert!");
            }
        }

        sc.close();
    }
}