package Assignments.A66;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {

            System.out.println(
                    "File does not exist."
            );

            sc.close();
            return;
        }

        SimpleDateFormat sdf =
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("\nFile Name     : "
                + file.getName());

        System.out.println("Absolute Path : "
                + file.getAbsolutePath());

        System.out.println("File Size     : "
                + file.length() + " bytes");

        System.out.println("Readable      : "
                + file.canRead());

        System.out.println("Writable      : "
                + file.canWrite());

        System.out.println("Hidden        : "
                + file.isHidden());

        System.out.println("Last Modified : "
                + sdf.format(new Date(file.lastModified())));

        sc.close();
    }
}