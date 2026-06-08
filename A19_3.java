package Assignments.A19;

class Logic
{
    void checkDivisible(int num)
    {
        if(num%5==0 && num%11==0)
        {
            System.out.println(num+" is divisible by both 5 and 11");
        }
        else if(num%5==0)
        {
            System.out.println(num+" is divisible by 5");
        }
        else if(num%11==0)
        {
            System.out.println(num+" is divisible by 11");
        }
        else
        {
            System.out.println(num+" is not divisible by either 5 or 11");
        }
    }
}
public class A19_3 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}
