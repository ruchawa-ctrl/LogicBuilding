package Assignments.A17;

class logic 
{
    void printTable(int num)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
public class A17_5 
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.printTable(5);
    }
}
