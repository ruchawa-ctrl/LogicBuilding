#include<stdio.h>

int CountDiff(int iNo)
{
    int iDigit = 0;
    int iEvenSum = 0;
    int iOddSum = 0;
    
    // Handle negative numbers
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit % 2 == 0)
        {
            iEvenSum = iEvenSum + iDigit;
        }
        else
        {
            iOddSum = iOddSum + iDigit;
        }
        iNo = iNo / 10;
    }
    
    return iEvenSum - iOddSum;
    
    /* Time Complexity: O(N) where N is the number of digits.
       Accumulates even and odd subsets sequentially in linear time relative to input length.
    */
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    iRet = CountDiff(iValue);
    
    printf("Difference between summation of even and odd digits: %d\n", iRet);
    
    return 0;
}