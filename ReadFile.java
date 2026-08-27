package Assignments.A66;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {
            FileInputStream fis =
                    new FileInputStream(fileName);

            System.out.println("\nFile contents:\n");

            int ch;

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (FileNotFoundException e) {

            System.out.println(
                    "File does not exist."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error reading file: "
                    + e.getMessage()
            );
        }

        sc.close();
    }
}
