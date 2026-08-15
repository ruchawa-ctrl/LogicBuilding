package Assignments.A61;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String sentence = sc.nextLine();
            String[] words = sentence.split(" ");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                StringBuilder reversedWord = new StringBuilder(words[i]);
                result.append(reversedWord.reverse().toString());

                if (i < words.length - 1) {
                    result.append(" ");
                }
            }

            System.out.println(result.toString());
        }

        sc.close();
    }
}