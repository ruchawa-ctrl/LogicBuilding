package Assignments.A54;

import java.util.Scanner;

public class RideFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int distance = sc.nextInt();

        if (!sc.hasNext()) {
            System.out.println("invalid input");
            return;
        }
        String peakHour = sc.next();

        if (distance < 0 || (!peakHour.equalsIgnoreCase("Yes") && !peakHour.equalsIgnoreCase("No"))) {
            System.out.println("invalid input");
            return;
        }

        double baseFare = 50.0;
        double distanceFare = 0.0;

        if (distance <= 10) {
            distanceFare = distance * 12.0;
        } else {
            distanceFare = (10 * 12.0) + (distance - 10) * 15.0;
        }

        double totalFare = baseFare + distanceFare;

        if (peakHour.equalsIgnoreCase("Yes")) {
            totalFare += totalFare * 0.20;
        }

        System.out.println("Distance: " + distance + " km");
        System.out.println("Peak Hour: " + (peakHour.equalsIgnoreCase("Yes") ? "Yes" : "No"));
        System.out.println("Total Fare: ₹" + (totalFare % 1 == 0 ? (int) totalFare : totalFare));

        sc.close();
    }
}