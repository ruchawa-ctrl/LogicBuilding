package Assignments.A18;

class Logic
{
    void checkPrime(int num)
    {
        int count = 0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}
public class A18_1 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
    
}
