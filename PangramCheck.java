package Assignments.A60;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String str = sc.nextLine().toLowerCase();
            Set<Character> letters = new HashSet<>();

            for (char ch : str.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    letters.add(ch);
                }
            }

            if (letters.size() == 26) {
                System.out.println("Pangram");
            } else {
                System.out.println("Not Pangram");
            }
        }

        sc.close();
    }
}