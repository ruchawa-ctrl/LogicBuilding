package Assignments.A67;

import java.io.*;
import java.util.*;

public class FileAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("File : ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File not found.");
            sc.close();
            return;
        }

        int iCharacters = 0;
        int iWords = 0;
        int iLines = 0;
        int iUppercase = 0;
        int iLowercase = 0;
        int iDigits = 0;
        int iSpaces = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                iLines++;

                // Count characters
                for (int i = 0; i < line.length(); i++) {

                    char ch = line.charAt(i);

                    iCharacters++;

                    if (Character.isUpperCase(ch)) {
                        iUppercase++;
                    }
                    else if (Character.isLowerCase(ch)) {
                        iLowercase++;
                    }
                    else if (Character.isDigit(ch)) {
                        iDigits++;
                    }
                    else if (ch == ' ') {
                        iSpaces++;
                    }
                }

                // Count words
                String trimmedLine = line.trim();

                if (!trimmedLine.isEmpty()) {
                    String[] words = trimmedLine.split("\\s+");
                    iWords += words.length;
                }
            }

            reader.close();

            System.out.println();
            System.out.println("Characters : " + iCharacters);
            System.out.println("Words      : " + iWords);
            System.out.println("Lines      : " + iLines);
            System.out.println("Uppercase  : " + iUppercase);
            System.out.println("Lowercase  : " + iLowercase);
            System.out.println("Digits     : " + iDigits);
            System.out.println("Spaces     : " + iSpaces);

        }
        catch (IOException e) {
            System.out.println("Error reading file.");
        }

        sc.close();
    }
}
