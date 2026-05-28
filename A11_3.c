#include<stdio.h>

int RangeSum(int iStart, int iEnd)
{
    int iSum = 0;
    
    // Range constraint checks: must be valid order and contain only positive numbers (>= 0)
    if((iStart > iEnd) || (iStart < 0))
    {
        return -1; // Using -1 as a distinct return code signaling an invalid range criteria met
    }
    
    for(int iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iSum = iSum + iCnt;
    }
    
    return iSum;
    
    /* Time Complexity: O(N) where N = (iEnd - iStart + 1).
       Explanation: Constant accumulation execution per integer member inside the loop structure.
    */
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;
    
    printf("Enter starting point: ");
    scanf("%d", &iValue1);
    
    printf("Enter ending point: ");
    scanf("%d", &iValue2);
    
    iRet = RangeSum(iValue1, iValue2);
    
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