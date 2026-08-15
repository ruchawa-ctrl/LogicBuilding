package Assignments.A58;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int totalDigits = 0;

        // Count number of digits
        int countTemp = num;
        while (countTemp > 0) {
            totalDigits++;
            countTemp /= 10;
        }

        int sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, totalDigits);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}