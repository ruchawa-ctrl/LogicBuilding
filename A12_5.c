#include<stdio.h>

int Count(int iNo)
{
    int iDigit = 0;
    int iCount = 0;
    
    // Explicit condition checking for exactly 0, as 0 is less than 6
    if(iNo == 0)
    {
        return 1;
    }
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit < 6)
        {
            iCount++;
        }
        iNo = iNo / 10;
    }
    
    return iCount;
    
    /* Time Complexity: O(N) where N is the number of digits.
       Explanation: Iteratively isolates and checks each digit location.
    */
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    iRet = Count(iValue);
    
    printf("Count of digits less than 6 is: %d\n", iRet);
    
    return 0;
}