package Assignments.A54;

import java.util.Scanner;

public class ScholarshipChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int marks = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int attendance = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int familyIncome = sc.nextInt();

        if (marks < 0 || marks > 100 || attendance < 0 || attendance > 100 || familyIncome < 0) {
            System.out.println("invalid input");
            return;
        }

        if (marks < 80) {
            System.out.println("Scholarship Rejected: Marks below 80%");
        } else if (attendance < 75) {
            System.out.println("Scholarship Rejected: Attendance below 75%");
        } else if (familyIncome > 300000) {
            System.out.println("Scholarship Rejected: Family income exceeds ₹3,00,000");
        } else {
            System.out.println("Scholarship Approved");
        }

        sc.close();
    }
}