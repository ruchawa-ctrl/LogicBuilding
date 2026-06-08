package Assignments.A17;

class Logic
{
    void findMin(int a,int b,int c)
    {
        int min = a;
        if(b < min)
        {
            min = b;
        }
        if(c < min)
        {
            min = c;
        }
        System.out.println("The minimum number is: " + min);
    }
}
  
public class A17_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}