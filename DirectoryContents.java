package Assignments.A66;

import java.io.File;
import java.util.Scanner;

public class DirectoryContents {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory: ");
        String path = sc.nextLine();

        File directory = new File(path);

        if (!directory.exists()) {

            System.out.println(
                    "Directory does not exist."
            );

            sc.close();
            return;
        }

        if (!directory.isDirectory()) {

            System.out.println(
                    "The given path is not a directory."
            );

            sc.close();
            return;
        }

        File[] contents = directory.listFiles();

        System.out.println("\nContents:\n");

        if (contents == null || contents.length == 0) {

            System.out.println("Directory is empty.");

        } else {

            for (File file : contents) {

                if (file.isDirectory()) {
                    System.out.println(
                            "[DIR]  " + file.getName()
                    );
                } else {
                    System.out.println(
                            "[FILE] " + file.getName()
                    );
                }
            }
        }

        sc.close();
    }
}
