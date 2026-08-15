package Assignments.A53;

import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int age = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int monthlyIncome = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int creditScore = sc.nextInt();

        if (!sc.hasNext()) {
            System.out.println("invalid input");
            return;
        }
        String existingLoan = sc.next();

        if (age < 0 || monthlyIncome < 0 || creditScore < 0 || 
            (!existingLoan.equalsIgnoreCase("Yes") && !existingLoan.equalsIgnoreCase("No"))) {
            System.out.println("invalid input");
            return;
        }

        if (age < 21 || age > 60) {
            System.out.println("Loan Rejected: Age must be between 21 and 60.");
        } else if (monthlyIncome < 25000) {
            System.out.println("Loan Rejected: Monthly income must be at least ₹25,000.");
        } else if (creditScore < 700) {
            System.out.println("Loan Rejected: Credit score must be at least 700.");
        } else if (existingLoan.equalsIgnoreCase("Yes")) {
            System.out.println("Loan Rejected: Applicant has an existing unpaid loan.");
        } else {
            System.out.println("Loan Approved");
        }

        sc.close();
    }
}