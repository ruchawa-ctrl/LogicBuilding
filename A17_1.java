package Assignments.A17;

class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
public class A17_1 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
    
}
