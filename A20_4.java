package Assignments.A20;

class Logic
{
    void findLargestDigit(int num)
    {
        int largest = 0;
        while(num>0)
        {
            int digit = num%10;
            if(digit>largest)
            {
                largest = digit;
            }
            num /= 10;
        }
        System.out.println("The largest digit is: "+largest);
    }
}
public class A20_4 {
    public static void main(String A[])
    {
       Logic obj = new Logic();
    obj.findLargestDigit(5);
    }
}
