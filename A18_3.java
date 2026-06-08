package Assignments.A18;

class Logic
{
    void printOddNumbers(int limit)
    {
        System.out.println("Odd numbers up to "+limit+":");
        for(int i=1; i<=limit; i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
public class A18_3 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
        
    }
}
