package Assignments.A59;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long square = num * num;
        long temp = num;
        long mod = 1;

        while (temp > 0) {
            mod *= 10;
            temp /= 10;
        }

        if (num >= 0 && square % mod == num) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }

        sc.close();
    }
}