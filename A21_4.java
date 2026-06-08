package Assignments.A21;
class logic
{
    void countFactors(int num)
    {
        int count = 0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        System.out.println("The number of factors of "+num+" is: "+count);
    }
}
public class A21_4 
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.countFactors(36);
    }
}
