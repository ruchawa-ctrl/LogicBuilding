#include<stdio.h>

int CountOdd(int iNo)
{
    int iDigit = 0;
    int iCount = 0;
    
    // Handle negative numbers
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit % 2 != 0)
        {
            iCount++;
        }
        iNo = iNo / 10;
    }
    
    return iCount;
    
    /* Time Complexity: O(N) where N is the number of digits.
       The loop runs proportionally to the total count of digits in the integer.
    */
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    iRet = CountOdd(iValue);
    
    printf("Count of odd digits: %d\n", iRet);
    
    return 0;
}