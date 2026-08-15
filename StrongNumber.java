package Assignments.A58;

import java.util.Scanner;

public class StrongNumber {
    // Helper method to calculate factorial of a digit
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if (sum == num && num > 0) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }

        sc.close();
    }
}