package Assignments.A52;

import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }

        int daysKept = sc.nextInt();

        if (daysKept < 0) {
            System.out.println("invalid input");
        } else if (daysKept <= 7) {
            System.out.println("Returned on time. No fine applicable.");
        } else {
            int fineAmount;
            if (daysKept <= 12) {
                fineAmount = (daysKept - 7) * 5;
            } else {
                fineAmount = (5 * 5) + (daysKept - 12) * 10;
            }
            System.out.println("Total fine to be paid: ₹" + fineAmount);
        }

        sc.close();
    }
}