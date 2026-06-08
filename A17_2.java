package Assignments.A17;

class Logic
{
    void checkPalindrome(int num)
    {
        int original = num;
        int reversed = 0;
        while(num > 0)
        {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        if(original == reversed)
        {
            System.out.println("The number is a palindrome.");
        }
        else
        {
            System.out.println("The number is not a palindrome.");
        }
    }
}
public class A17_2 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
    
}