package Assignments.A66;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String sourceFile = sc.nextLine();

        System.out.print("\nEnter destination file: ");
        String destinationFile = sc.nextLine();

        try {

            FileInputStream fis =
                    new FileInputStream(sourceFile);

            FileOutputStream fos =
                    new FileOutputStream(destinationFile);

            byte[] buffer = new byte[4096];

            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {

                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println(
                    "\nFile copied successfully"
            );

        } catch (FileNotFoundException e) {

            System.out.println(
                    "Source file does not exist."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error copying file: "
                    + e.getMessage()
            );
        }

        sc.close();
    }
}
