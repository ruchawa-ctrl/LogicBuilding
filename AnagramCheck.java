package Assignments.A60;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
            if (sc.hasNextLine()) {
                String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

                if (str1.length() != str2.length()) {
                    System.out.println("Not Anagram");
                } else {
                    char[] arr1 = str1.toCharArray();
                    char[] arr2 = str2.toCharArray();

                    Arrays.sort(arr1);
                    Arrays.sort(arr2);

                    if (Arrays.equals(arr1, arr2)) {
                        System.out.println("Anagram");
                    } else {
                        System.out.println("Not Anagram");
                    }
                }
            }
        }

        sc.close();
    }
}