#include<stdio.h>

int CountEven(int iNo)
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
        if(iDigit % 2 == 0)
        {
            iCount++;
        }
        iNo = iNo / 10;
    }
    
    return iCount;
    
    /* Time Complexity: O(N) where N is the number of digits in iNo.
       More precisely, it takes O(log10(iNo)) iterations since the number 
       is divided by 10 in every step.
    */
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    iRet = CountEven(iValue);
    
    printf("Count of even digits: %d\n", iRet);
    
    return 0;
}