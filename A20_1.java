package Assignments.A20;

class Logic
{
    void sumEvenNumbers()
    {
        int sum = 0;
        for(int i=1; i<=100; i++)
        {
            if(i%2==0)
            {
                sum += i;
            }
        }
        System.out.println("The sum of even numbers from 1 to 100 is: "+sum);
    }
}
public class A20_1 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers();
    }
}
