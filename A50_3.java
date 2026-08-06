package Assignments.A50;
import java.io.File;
import java.util.Scanner;

public class A50_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if (dir.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Directory already exists or cannot be created.");
        }

        sc.close();
    }
}