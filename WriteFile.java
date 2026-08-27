package Assignments.A66;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("\nEnter data: ");
        String data = sc.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream(fileName);

            byte[] bytes = data.getBytes();

            fos.write(bytes);

            fos.close();

            System.out.println("\nData written successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
