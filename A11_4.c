#include<stdio.h>

int RangeSumEven(int iStart, int iEnd)
{
    int iSum = 0;
    
    // Range validation filters out inverted segments or presence of negative integer inputs
    if((iStart > iEnd) || (iStart < 0))
    {
        return -1; 
    }
    
    for(int iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iSum = iSum + iCnt;
        }
    }
    
    return iSum;
    
    /* Time Complexity: O(N) where N = (iEnd - iStart + 1).
       Explanation: A linear traversal loop checks and sums even subset targets sequentially.
    */
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;
    
    printf("Enter starting point: ");
    scanf("%d", &iValue1);
    
    printf("Enter ending point: ");
    scanf("%d", &iValue2);
    
    iRet = RangeSumEven(iValue1, iValue2);
    
    if(iRet == -1)
    {
        printf("Invalid range\n");
    }
    else
    {
        printf("Addition is %d\n", iRet);
    }
    
    return 0;
}