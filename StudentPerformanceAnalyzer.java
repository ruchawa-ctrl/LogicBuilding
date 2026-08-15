package Assignments.A57;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Invalid Input");
            return;
        }
        int n = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("Invalid Input");
            return;
        }
        int m = sc.nextInt();

        // Validations: N > 0 and M > 0
        if (n <= 0 || m <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int[][] marks = new int[n][m];
        int[] studentTotals = new int[n];
        List<Integer> failedStudents = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int currentTotal = 0;
            boolean hasFailedSubject = false;

            for (int j = 0; j < m; j++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid Input");
                    return;
                }
                marks[i][j] = sc.nextInt();

                // Validation: Mark must be between 0 and 100
                if (marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.println("Invalid Input");
                    return;
                }

                if (marks[i][j] < 35) {
                    hasFailedSubject = true;
                }

                currentTotal += marks[i][j];
            }

            studentTotals[i] = currentTotal;
            if (hasFailedSubject) {
                failedStudents.add(i + 1);
            }
        }

        // 1. Calculate & print Student Totals and find Topper
        int topperIndex = 0;
        int maxTotal = -1;

        System.out.println("Student Totals:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentTotals[i]);
            if (studentTotals[i] > maxTotal) {
                maxTotal = studentTotals[i];
                topperIndex = i + 1;
            }
        }

        // 2. Print Topper
        System.out.println();
        System.out.println("Topper: Student " + topperIndex);

        // 3. Calculate & print Subject Averages
        System.out.println();
        System.out.println("Subject Averages:");
        for (int j = 0; j < m; j++) {
            int subjectSum = 0;
            for (int i = 0; i < n; i++) {
                subjectSum += marks[i][j];
            }
            double average = (double) subjectSum / n;
            System.out.printf(Locale.US, "Subject %d: %.2f\n", (j + 1), average);
        }

        // 4. Print Students Failed
        System.out.println();
        System.out.println("Students Failed:");
        if (failedStudents.isEmpty()) {
            System.out.println("None");
        } else {
            for (int studentId : failedStudents) {
                System.out.println("Student " + studentId);
            }
        }

        sc.close();
    }
}