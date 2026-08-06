import java.io.File;
import java.util.Scanner;

class DisplayFiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sc.nextLine();

        File directory = new File(dirName);

        if (directory.exists() && directory.isDirectory()) {

            String[] files = directory.list();

            System.out.println("Files in directory:");

            for (String file : files) {
                System.out.println(file);
            }

        } else {
            System.out.println("Directory does not exist.");
        }

        sc.close();
    }
}