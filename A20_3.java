package Assignments.A20;
    
class Logic
{
    void checkPerfect(int num)
    {
        int sum = 0;
        for(int i=1; i<num; i++)
        {
            if(num%i==0)
            {
                sum += i;
            }
        }
        if(sum==num)
        {
            System.out.println(num+" is a perfect number.");
        }
        else
        {
            System.out.println(num+" is not a perfect number.");
        }
    }
}
public class A20_3 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}
