package Assignments.A65;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        try {

            if (file.exists()) {

                System.out.println(
                        fileName + " already exists"
                );

            } else {

                if (file.createNewFile()) {

                    System.out.println(
                            fileName +
                            " created successfully"
                    );

                } else {

                    System.out.println(
                            "File could not be created"
                    );
                }
            }

            System.out.println("\nFile name : "
                    + file.getName());

            System.out.println("Absolute path : "
                    + file.getAbsolutePath());

            System.out.println("File creation successful : "
                    + file.exists());

        } catch (IOException e) {

            System.out.println(
                    "Error creating file: "
                    + e.getMessage()
            );
        }

        sc.close();
    }
}