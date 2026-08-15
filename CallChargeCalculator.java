package Assignments.A56;

import java.util.Scanner;

public class CallChargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }

        int duration = sc.nextInt();

        if (duration < 0) {
            System.out.println("invalid input");
            return;
        }

        int totalCharge = 0;

        if (duration <= 5) {
            totalCharge = 0;
        } else if (duration <= 15) {
            totalCharge = (duration - 5) * 1;
        } else {
            totalCharge = (10 * 1) + (duration - 15) * 2;
        }

        System.out.println("Call Duration: " + duration + " minutes");
        System.out.println("Total Call Charge: ₹" + totalCharge);

        sc.close();
    }
}