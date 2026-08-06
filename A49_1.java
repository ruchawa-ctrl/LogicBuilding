import java.io.File;
import java.util.Scanner;

class OpenFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File opened successfully.");
        } else {
            System.out.println("File does not exist.");
        }

        sc.close();
    }
}