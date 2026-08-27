package Assignments.A67;

import java.io.File;
import java.util.Scanner;

public class FileDirectoryListing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }

        File[] items = directory.listFiles();

        if (items == null) {
            System.out.println("Unable to read directory.");
            return;
        }

        for (File item : items) {

            if (item.isFile()) {
                System.out.println("[FILE] " + item.getName());
                System.out.println("       " + item.length() + " bytes");
            }
            else if (item.isDirectory()) {
                System.out.println("[DIR]  " + item.getName());
            }
        }

        sc.close();
    }
}
