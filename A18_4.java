package Assignments.A18;

class Logic
{
    void sumEvenOddDigits(int num)
    {
        int evenSum = 0;
        int oddSum = 0;
        while(num>0)
        {
            int digit = num%10;
            if(digit%2==0)
            {
                evenSum += digit;
            }
            else
            {
                oddSum += digit;
            }
            num /= 10;
        }
        System.out.println("Sum of even digits: "+evenSum);
        System.out.println("Sum of odd digits: "+oddSum);
    }
}
public class A18_4 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
