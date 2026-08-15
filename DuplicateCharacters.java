package Assignments.A60;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            Map<Character, Integer> charCount = new LinkedHashMap<>();

            for (char ch : str.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            StringBuilder result = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() > 1) {
                    result.append(entry.getKey()).append(" ");
                }
            }

            System.out.println(result.toString().trim());
        }

        sc.close();
    }
}