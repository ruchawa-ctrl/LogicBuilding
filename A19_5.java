package Assignments.A19;

class Logic
{
    void calculatePower(int base, int exponent)
    {
        int result = 1;
        for(int i=1; i<=exponent; i++)
        {
            result *= base;
        }
        System.out.println(base+" raised to the power of "+exponent+" is: "+result);
    }
}
public class A19_5 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}
