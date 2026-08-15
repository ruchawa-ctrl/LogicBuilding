package Assignments.A59;

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String str = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            sum += Math.pow(digit, i + 1);
        }

        if (sum == num) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not Disarium Number");
        }

        sc.close();
    }
}