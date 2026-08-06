import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class AppendFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter data to append: ");
        String data = sc.nextLine();

        try {
            FileWriter fw = new FileWriter(fileName, true);

            fw.write(data);
            fw.write("\n");

            fw.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}