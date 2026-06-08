package Assignments.A19;

class Logic
{
    void printDigits(int num)
    {
        System.out.println("Digits in the number "+num+" are:");
        while(num>0)
        {
            int digit = num%10;
            System.out.print(digit+" ");
            num = num/10;
        }
    }
}
public class A19_4 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
