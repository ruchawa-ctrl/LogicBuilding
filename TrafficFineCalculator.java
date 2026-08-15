package Assignments.A53;

import java.util.Scanner;

public class TrafficFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            System.out.println("invalid input");
            return;
        }
        String helmetWorn = sc.next();

        if (!sc.hasNext()) {
            System.out.println("invalid input");
            return;
        }
        String licenseAvailable = sc.next();

        if (!sc.hasNext()) {
            System.out.println("invalid input");
            return;
        }
        String overspeeding = sc.next();

        if (!isValidYesNo(helmetWorn) || !isValidYesNo(licenseAvailable) || !isValidYesNo(overspeeding)) {
            System.out.println("invalid input");
            return;
        }

        int totalFine = 0;

        if (helmetWorn.equalsIgnoreCase("No")) {
            totalFine += 500;
        }
        if (licenseAvailable.equalsIgnoreCase("No")) {
            totalFine += 1000;
        }
        if (overspeeding.equalsIgnoreCase("Yes")) {
            totalFine += 1500;
        }

        System.out.println("Total Fine Amount: ₹" + totalFine);

        sc.close();
    }

    private static boolean isValidYesNo(String input) {
        return input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("No");
    }
}