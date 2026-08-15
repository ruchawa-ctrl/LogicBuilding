package Assignments.A58;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int reversed = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = (reversed * 10) + digit;
            temp /= 10;
        }

        if (reversed == num && num >= 0) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }

        sc.close();
    }
}