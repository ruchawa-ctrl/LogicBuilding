package Assignments.A20;

class Logic
{
    void printReverse(int num)
    {
        System.out.print("The reverse of "+num+" is: ");
        while(num>0)
        {
            int digit = num%10;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println();
    }
}
public class A20_2 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}
