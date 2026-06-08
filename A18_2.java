package Assignments.A18;

class Logic{
    void printEvenNumbers(int limit)
    {
        System.out.println("Even numbers up to "+limit+":");
        for(int i=1; i<=limit; i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
public class A18_2 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
