#include<stdio.h>

void DisplayDigit(int iNo)
{
    int iDigit = 0;
    
    // Fill in the blank for checking negative numbers
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    // Fill in the blank for the loop condition
    while(iNo > 0)
    {
        // Extract the last digit using the modulus operator
        iDigit = iNo % 10;
        printf("%d\n", iDigit);
        
        // Remove the last digit by dividing the number by 10
        iNo = iNo / 10;
    }
    
    /* Time Complexity: O(N) where N is the number of digits in iNo.
       Explanation: The loop runs once for every single digit present in the integer.
    */
}

int main()
{
    int iValue = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    DisplayDigit(iValue);
    
    return 0;
}