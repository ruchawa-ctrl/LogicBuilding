package Assignments.A61;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            int vowels = 0;
            int consonants = 0;

            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char lower = Character.toLowerCase(ch);
                    if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }

        sc.close();
    }
}