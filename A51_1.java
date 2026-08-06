package Assignments.A51;
import java.io.File;
import java.util.Scanner;

public class A51_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if(dir.exists() && dir.isDirectory())
        {
            File[] files = dir.listFiles();

            System.out.println("\nRegular Files:");

            for(File file : files)
            {
                if(file.isFile())
                {
                    System.out.println(file.getName());
                }
            }
        }
        else
        {
            System.out.println("Invalid Directory");
        }

        sc.close();
    }
}