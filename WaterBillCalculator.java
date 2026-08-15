package Assignments.A55;

import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int units = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int weeksLate = sc.nextInt();

        if (units < 0 || weeksLate < 0) {
            System.out.println("invalid input");
            return;
        }

        double meterCharge = 100.0;
        double slabCharge = 0.0;

        // Progressive Slabs:
        // 0 - 100 units: ₹3/unit
        // 101 - 200 units: ₹5/unit
        // > 200 units: ₹8/unit
        if (units <= 100) {
            slabCharge = units * 3.0;
        } else if (units <= 200) {
            slabCharge = (100 * 3.0) + (units - 100) * 5.0;
        } else {
            slabCharge = (100 * 3.0) + (100 * 5.0) + (units - 200) * 8.0;
        }

        double baseBill = meterCharge + slabCharge;

        // Late fee: 2% per week late, capped at max 10%
        double penaltyPercent = Math.min(weeksLate * 2.0, 10.0);
        double penaltyAmount = baseBill * (penaltyPercent / 100.0);
        double billAmount = baseBill + penaltyAmount;

        System.out.println("Base Bill: ₹" + baseBill);
        System.out.println("Late Penalty (" + penaltyPercent + "%): ₹" + penaltyAmount);
        System.out.println("Total Bill Amount: ₹" + billAmount);

        sc.close();
    }
}