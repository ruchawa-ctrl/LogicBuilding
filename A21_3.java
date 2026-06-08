package Assignments.A21;

class Logic
{
    void displayFactors(int num)
    {
        System.out.print("The factors of "+num+" are: ");
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
public class A21_3 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
