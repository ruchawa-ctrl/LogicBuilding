package Assignments.A69;

import java.util.*;

public class A69_4 {

    public static void main(String[] args) {

        String input = "java python java c java python cpp";

        String[] words = input.split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(
                word,
                frequency.getOrDefault(word, 0) + 1
            );
        }

        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {

            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Frequency: " + maxFrequency);
    }
}