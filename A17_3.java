package Assignments.A17;

class Logic 
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println("The maximum number is: " + a);
        }
        else if(b > a)
        {
            System.out.println("The maximum number is: " + b);
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
    }
}
public class A17_3 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMax(10, 20);
    }
    
}
