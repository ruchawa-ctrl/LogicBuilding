#include<stdio.h>

int CountRange(int iNo)
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
        // Strictly checks for digits strictly between 3 and 7 (4, 5, 6)
        if(iDigit > 3 && iDigit < 7)
        {
            iCount++;
        }
        iNo = iNo / 10;
    }
    
    return iCount;
    
    /* Time Complexity: O(N) where N is the number of digits.
       Each digit is checked exactly once through division scaling.
    */
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    iRet = CountRange(iValue);
    
    printf("Count of digits between 3 and 7: %d\n", iRet);
    
    return 0;
}