package Assignments.A60;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            Map<Character, Integer> freqMap = new LinkedHashMap<>();

            for (char ch : str.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        sc.close();
    }
}