package Assignments.A50;
import java.io.File;
import java.util.Scanner;

public class A50_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            System.out.println("It is a regular file.");
        } else {
            System.out.println("It is NOT a regular file.");
        }

        sc.close();
    }
}