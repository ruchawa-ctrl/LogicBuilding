#include<stdio.h>

int CountFour(int iNo)
{
    int iDigit = 0;
    int iCount = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 4)
        {
            iCount++;
        }
        iNo = iNo / 10;
    }
    
    return iCount;
    
    /* Time Complexity: O(N) where N is the number of digits.
       Explanation: Traverses across the digits in a single pass.
    */
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    iRet = CountFour(iValue);
    
    printf("Frequency of 4 is: %d\n", iRet);
    
    return 0;
}