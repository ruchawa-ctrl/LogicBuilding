package Assignments.A50;
import java.io.File;
import java.util.Scanner;

public class A50_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

            System.out.println("\nFiles in directory:");

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName() +
                                " - " + file.length() + " bytes");
                    }
                }
            }
        } else {
            System.out.println("Invalid directory.");
        }

        sc.close();
    }
}