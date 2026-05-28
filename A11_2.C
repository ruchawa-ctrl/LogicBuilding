#include<stdio.h>

void RangeDisplayEven(int iStart, int iEnd)
{
    if(iStart > iEnd)
    {
        printf("Invalid range\n");
        return;
    }
    
    for(int iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            printf("%d ", iCnt);
        }
    }
    printf("\n");
    
    /* Time Complexity: O(N) where N = (iEnd - iStart + 1).
       Explanation: The loop scans every integer block sequentially to apply the parity modulo filter.
    */
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    
    printf("Enter starting point: ");
    scanf("%d", &iValue1);
    
    printf("Enter ending point: ");
    scanf("%d", &iValue2);
    
    RangeDisplayEven(iValue1, iValue2);
    
    return 0;
}