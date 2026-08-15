package Assignments.A56;

import java.util.Scanner;

public class FitnessStepTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DAILY_GOAL = 10000; // Standard daily step goal

        int goalAchievedDays = 0;
        int maxSteps = 0;

        for (int i = 0; i < 7; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("invalid input");
                return;
            }
            int steps = sc.nextInt();

            if (steps < 0) {
                System.out.println("invalid input");
                return;
            }

            if (steps >= DAILY_GOAL) {
                goalAchievedDays++;
            }

            if (steps > maxSteps) {
                maxSteps = steps;
            }
        }

        System.out.println("Goal Achieved Days: " + goalAchievedDays);
        System.out.println("Maximum Steps in Week: " + maxSteps);

        sc.close();
    }
}