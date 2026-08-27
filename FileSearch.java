package Assignments.A67;

import java.io.File;
import java.util.Scanner;

public class FileSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory: ");
        String directoryPath = sc.nextLine();

        System.out.print("Enter file to search: ");
        String fileName = sc.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }

        File[] files = directory.listFiles();

        boolean found = false;

        if (files != null) {
            for (File file : files) {

                if (file.isFile() && file.getName().equals(fileName)) {

                    System.out.println("\nFile found\n");

                    System.out.println("Name : " + file.getName());
                    System.out.println("Size : " + file.length() + " bytes");
                    System.out.println("Path : " + file.getAbsolutePath());

                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("\n" + fileName + " not found");
        }

        sc.close();
    }
}