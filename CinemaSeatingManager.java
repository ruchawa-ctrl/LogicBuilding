package Assignments.A57;

import java.util.Scanner;

public class CinemaSeatingManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Invalid Input");
            return;
        }
        int r = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("Invalid Input");
            return;
        }
        int c = sc.nextInt();

        // Validations: R > 0 and C > 0
        if (r <= 0 || c <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int[][] seats = new int[r][c];
        int totalBooked = 0;
        int maxBookingsInRow = -1;
        int rowWithMaxBookings = 1;
        boolean fullRowExists = false;

        for (int i = 0; i < r; i++) {
            int rowBookedCount = 0;

            for (int j = 0; j < c; j++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid Input");
                    return;
                }
                seats[i][j] = sc.nextInt();

                // Validation: values must be 0 or 1 only
                if (seats[i][j] != 0 && seats[i][j] != 1) {
                    System.out.println("Invalid Input");
                    return;
                }

                if (seats[i][j] == 1) {
                    rowBookedCount++;
                    totalBooked++;
                }
            }

            if (rowBookedCount > maxBookingsInRow) {
                maxBookingsInRow = rowBookedCount;
                rowWithMaxBookings = i + 1;
            }

            if (rowBookedCount == c) {
                fullRowExists = true;
            }
        }

        // Expected Output
        System.out.println("Total Booked Seats: " + totalBooked);
        System.out.println("Row With Maximum Bookings: Row " + rowWithMaxBookings);
        System.out.println("Full Row Exists: " + (fullRowExists ? "Yes" : "No"));

        sc.close();
    }
}