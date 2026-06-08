package Assignments.A20;
    
class Logic
{
    void findSmallestDigit(int num)
    {
        int smallest = 9;
        while(num>0)
        {
            int digit = num%10;
            if(digit<smallest)
            {
                smallest = digit;
            }
            num /= 10;
        }
        System.out.println("The smallest digit is: "+smallest);
    }
}

public class A20_5 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        ;
        obj.findSmallestDigit(45872);
    }
}
