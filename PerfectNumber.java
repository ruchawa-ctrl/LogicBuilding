package Assignments.A58;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Not Perfect Number");
            sc.close();
            return;
        }

        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }

        sc.close();
    }
}