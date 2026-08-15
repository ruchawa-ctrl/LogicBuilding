package Assignments.A58;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int sumOfDigits = 0;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (sumOfDigits != 0 && num % sumOfDigits == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }

        sc.close();
    }
}