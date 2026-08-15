package Assignments.A54;

import java.util.Scanner;

public class CourierChargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }

        int weight = sc.nextInt();

        if (weight <= 0) {
            System.out.println("invalid input");
            return;
        }

        int charge = 0;

        if (weight <= 1) {
            charge = 50;
        } else if (weight <= 5) {
            charge = 50 + (weight - 1) * 20;
        } else {
            charge = 150 + (weight - 5) * 30;
        }

        System.out.println("Parcel Weight: " + weight + " kg");
        System.out.println("Courier Charge: ₹" + charge);

        sc.close();
    }
}