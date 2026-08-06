package Assignments.A51;
import java.io.*;
import java.util.Scanner;

public class A51_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if(dir.exists() && dir.isDirectory())
        {
            try
            {
                BufferedWriter bw = new BufferedWriter(new FileWriter("Marvellous.txt"));

                File[] files = dir.listFiles();

                for(File file : files)
                {
                    if(file.isFile())
                    {
                        bw.write(file.getName());
                        bw.newLine();
                    }
                }

                bw.close();

                System.out.println("Names copied successfully to Marvellous.txt");
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Invalid Directory");
        }

        sc.close();
    }
}