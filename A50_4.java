package Assignments.A50;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class A50_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int checksum = 0;

        try {
            FileInputStream fin = new FileInputStream(fileName);

            int ch;
            while ((ch = fin.read()) != -1) {
                checksum += ch;
            }

            fin.close();

            System.out.println("Checksum of file = " + checksum);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}