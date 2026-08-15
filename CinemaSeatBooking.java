package Assignments.A55;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CinemaSeatBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int rows = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("invalid input");
            return;
        }

        // Row pricing: Row 1-2 (₹150), Row 3-5 (₹250), Row 6+ (₹350)
        int numBooked = sc.nextInt();
        Set<String> bookedSeats = new HashSet<>();
        for (int i = 0; i < numBooked; i++) {
            bookedSeats.add(sc.next().toUpperCase());
        }

        int numRequested = sc.nextInt();
        String[] requestedSeats = new String[numRequested];
        for (int i = 0; i < numRequested; i++) {
            requestedSeats[i] = sc.next().toUpperCase();
        }

        // Validate availability
        boolean canBook = true;
        for (String seat : requestedSeats) {
            char rowChar = seat.charAt(0);
            int rowIdx = rowChar - 'A' + 1;
            int colIdx = Integer.parseInt(seat.substring(1));

            if (rowIdx < 1 || rowIdx > rows || colIdx < 1 || colIdx > cols || bookedSeats.contains(seat)) {
                canBook = false;
                break;
            }
        }

        if (!canBook) {
            System.out.println("Booking Failed: One or more selected seats are unavailable.");
            return;
        }

        double totalCost = 0.0;
        for (String seat : requestedSeats) {
            int rowIdx = seat.charAt(0) - 'A' + 1;
            if (rowIdx <= 2) {
                totalCost += 150.0;
            } else if (rowIdx <= 5) {
                totalCost += 250.0;
            } else {
                totalCost += 350.0;
            }
            bookedSeats.add(seat);
        }

        // Group discount of 10% if group size >= 6
        if (numRequested >= 6) {
            totalCost -= totalCost * 0.10;
        }

        int totalSeats = rows * cols;
        int remainingSeats = totalSeats - bookedSeats.size();

        System.out.println("Booking Status: Success");
        System.out.println("Total Cost: ₹" + totalCost);
        System.out.println("Remaining Seats: " + remainingSeats);

        sc.close();
    }
}
