package Assignments.A19;
class Logic
{
 void displayGrades(int marks)
 {
     if(marks>=90)
     {
         System.out.println("Grade: A");
     }
     else if(marks>=80)
     {
         System.out.println("Grade: B");
     }
     else if(marks>=70)
     {
         System.out.println("Grade: C");
     }
     else if(marks>=60)
     {
         System.out.println("Grade: D");
     }
     else
     {
         System.out.println("Grade: F");
     }
 }
}
public class A19_2 {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrades(82);
    }
}
