package Assignments.A21;

class logic
{
    void countEvenOddRange(int num)
    {
        int evenCount = 0;
        int oddCount = 0;
        for(int i=1; i<=num; i++)
        {
            if(i%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Number of even numbers between 1 and "+num+" is: "+evenCount);
        System.out.println("Number of odd numbers between 1 and "+num+" is: "+oddCount);
    }
}
public class A21_2 {
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.countEvenOddRange(50);
    }
}
