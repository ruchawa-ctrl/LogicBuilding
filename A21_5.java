package Assignments.A21;

class Logic
{
    void printDivisibleBy2And3(int num)
    {
        System.out.print("Numbers between 1 and "+num+" that are divisible by both 2 and 3 are: ");
        for(int i=1; i<=num; i++)
        {
            if(i%2==0 && i%3==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
public class A21_5 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2And3(30);
    }
}
