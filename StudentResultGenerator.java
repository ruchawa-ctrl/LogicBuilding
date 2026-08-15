package Assignments.A52;

import java.util.Scanner;

public class StudentResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        boolean hasFailed = false;

        for (int i = 0; i < 5; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("invalid input");
                return;
            }
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("invalid input");
                return;
            }

            if (marks[i] < 35) {
                hasFailed = true;
            }
            total += marks[i];
        }

        if (hasFailed) {
            System.out.println("Result: Fail");
        } else {
            double avg = total / 5.0;
            String classification;

            if (avg >= 75) {
                classification = "Distinction";
            } else if (avg >= 60) {
                classification = "First Class";
            } else if (avg >= 50) {
                classification = "Second Class";
            } else {
                classification = "Pass";
            }

            System.out.println("Average Marks: " + avg);
            System.out.println("Final Result: " + classification);
        }

        sc.close();
    }
}