package Assignments.A61;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            Set<Character> seen = new LinkedHashSet<>();

            for (char ch : str.toCharArray()) {
                seen.add(ch);
            }

            StringBuilder result = new StringBuilder();
            for (char ch : seen) {
                result.append(ch);
            }

            System.out.println(result.toString());
        }

        sc.close();
    }
}