package Assignments.A18;

class Logic
{
    void checkSign(int num)
    {
        if(num>0)
        {
            System.out.println(num+" is a positive number");
        }
        else if(num<0)
        {
            System.out.println(num+" is a negative number");
        }
        else
        {
            System.out.println(num+" is zero");
        }
    }
}
public class A18_5 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
    
}
