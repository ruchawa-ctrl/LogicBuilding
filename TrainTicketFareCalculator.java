package Assignments.A55;
import java.util.Scanner;

public class TrainTicketFareCalculator {
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
        String classType = sc.next();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int bookingHoursBefore = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int age = sc.nextInt();

        // Validations
        if (distance <= 0 || bookingHoursBefore < 0 || age <= 0 ||
            (!classType.equalsIgnoreCase("Sleeper") && 
             !classType.equalsIgnoreCase("3AC") && 
             !classType.equalsIgnoreCase("2AC"))) {
            System.out.println("invalid input");
            return;
        }

        // Distance base fare slabs:
        // First 200 km: ₹1.0/km; Next 300 km (201-500): ₹0.8/km; Above 500 km: ₹0.6/km
        double baseFare;
        if (distance <= 200) {
            baseFare = distance * 1.0;
        } else if (distance <= 500) {
            baseFare = (200 * 1.0) + (distance - 200) * 0.8;
        } else {
            baseFare = (200 * 1.0) + (300 * 0.8) + (distance - 500) * 0.6;
        }

        // Class surcharge
        double classCharge = 0.0;
        if (classType.equalsIgnoreCase("3AC")) {
            classCharge = 300.0;
        } else if (classType.equalsIgnoreCase("2AC")) {
            classCharge = 600.0;
        }

        double fareBeforeCharges = baseFare + classCharge;

        // Tatkal surcharge: 30% if booked within 24 hours
        double tatkalCharge = 0.0;
        if (bookingHoursBefore <= 24) {
            tatkalCharge = fareBeforeCharges * 0.30;
        }

        double fareWithTatkal = fareBeforeCharges + tatkalCharge;

        // Senior citizen discount: 40% if age >= 60
        double discount = 0.0;
        if (age >= 60) {
            discount = fareWithTatkal * 0.40;
        }

        double finalFare = fareWithTatkal - discount;

        System.out.println("--- Fare Breakdown ---");
        System.out.println("Base Distance Fare: ₹" + baseFare);
        System.out.println("Class Extra Charge (" + classType + "): ₹" + classCharge);
        System.out.println("Tatkal Surcharge (30%): ₹" + tatkalCharge);
        System.out.println("Senior Citizen Discount (40%): ₹" + discount);
        System.out.println("Final Fare: ₹" + finalFare);

        sc.close();
    }
}