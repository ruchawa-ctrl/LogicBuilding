package Assignments.A53;

import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }

        int hours = sc.nextInt();

        if (hours < 0) {
            System.out.println("invalid input");
            return;
        }

        int fee = 0;
        if (hours > 0) {
            if (hours <= 2) {
                fee = 20;
            } else {
                fee = 20 + (hours - 2) * 10;
            }

            if (hours > 10) {
                fee += 50;
            }
        }

        System.out.println("Total Parking Duration: " + hours + " hours");
        System.out.println("Total Parking Fee: ₹" + fee);

        sc.close();
    }
}