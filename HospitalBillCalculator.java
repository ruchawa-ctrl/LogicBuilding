package Assignments.A55;

import java.util.Scanner;

public class HospitalBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int days = sc.nextInt();

        if (!sc.hasNext()) {
            System.out.println("invalid input");
            return;
        }
        String wardType = sc.next();

        if (!sc.hasNextDouble()) {
            System.out.println("invalid input");
            return;
        }
        double medicineBill = sc.nextDouble();

        if (!sc.hasNextDouble()) {
            System.out.println("invalid input");
            return;
        }
        double consultationFee = sc.nextDouble();

        if (!sc.hasNext()) {
            System.out.println("invalid input");
            return;
        }
        String insured = sc.next();

        // Validations
        if (days < 0 || medicineBill < 0 || consultationFee < 0 ||
            (!wardType.equalsIgnoreCase("Normal") && !wardType.equalsIgnoreCase("ICU")) ||
            (!insured.equalsIgnoreCase("Yes") && !insured.equalsIgnoreCase("No"))) {
            System.out.println("invalid input");
            return;
        }

        // Room rates per day: Normal = ₹1,500, ICU = ₹4,000
        double roomRate = wardType.equalsIgnoreCase("ICU") ? 4000.0 : 1500.0;
        double roomCharges = days * roomRate;
        double totalBill = roomCharges + medicineBill + consultationFee;

        double insuranceCover = 0.0;
        if (insured.equalsIgnoreCase("Yes")) {
            // Insurance covers up to ₹50,000 or 70% of total bill (whichever is lower)
            insuranceCover = Math.min(50000.0, 0.70 * totalBill);
        }

        double finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Insurance Cover: ₹" + insuranceCover);
        System.out.println("Final Payable Amount: ₹" + finalPay);

        sc.close();
    }
}