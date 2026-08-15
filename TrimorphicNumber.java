package Assignments.A59;

import java.util.Scanner;

public class TrimorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long cube = num * num * num;
        long temp = num;
        long mod = 1;

        while (temp > 0) {
            mod *= 10;
            temp /= 10;
        }

        if (num >= 0 && cube % mod == num) {
            System.out.println("Trimorphic Number");
        } else {
            System.out.println("Not Trimorphic Number");
        }

        sc.close();
    }
}