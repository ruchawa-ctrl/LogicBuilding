package Assignments.A59;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int nextNum = num + 1;
        double sqrt = Math.sqrt(nextNum);

        if (sqrt == Math.floor(sqrt) && num >= 0) {
            System.out.println("Sunny Number");
        } else {
            System.out.println("Not Sunny Number");
        }

        sc.close();
    }
}