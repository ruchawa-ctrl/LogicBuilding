package Assignments.A54;

import java.util.Scanner;

public class BatteryWarningSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }

        int battery = sc.nextInt();

        if (battery < 0 || battery > 100) {
            System.out.println("invalid input");
            return;
        }

        String status;
        if (battery <= 5) {
            status = "Critical";
        } else if (battery <= 15) {
            status = "Low";
        } else {
            status = "Normal";
        }

        System.out.println("Battery Percentage: " + battery + "%");
        System.out.println("Status: " + status);

        sc.close();
    }
}