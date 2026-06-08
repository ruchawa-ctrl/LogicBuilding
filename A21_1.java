package Assignments.A21;

class Logic
{
    void productOfDigits()
    {
        int num = 1234;
        int product = 1;
        while(num>0)
        {
            int digit = num%10;
            product *= digit;
            num /= 10;
        }
        System.out.println("The product of the digits is: "+product);
    }
}
public class A21_1 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.productOfDigits();
    }
}
