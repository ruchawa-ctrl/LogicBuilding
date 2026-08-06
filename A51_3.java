package Assignments.A51;
import java.io.*;
import java.util.Scanner;

public class A51_3
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
                        BufferedReader br = new BufferedReader(new FileReader(file));

                        String line;

                        while((line = br.readLine()) != null)
                        {
                            bw.write(line);
                            bw.newLine();
                        }

                        br.close();
                    }
                }

                bw.close();

                System.out.println("Data copied successfully.");
            }
            catch(Exception e)
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