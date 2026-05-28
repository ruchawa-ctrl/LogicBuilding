#include<stdio.h>

void RangeDisplayRev(int iStart, int iEnd)
{
    if(iStart > iEnd)
    {
        printf("Invalid range\n");
        return;
    }
    
    // Start at the maximum upper bound limit and step backward systematically
    for(int iCnt = iEnd; iCnt >= iStart; iCnt--)
    {
        printf("%d ", iCnt);
    }
    printf("\n");
    
    /* Time Complexity: O(N) where N = (iEnd - iStart + 1).
       Explanation: Reversing the direction map does not affect processing complexity; 
                    the logic still traces exactly N discrete scalar points.
    */
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    
    printf("Enter starting point: ");
    scanf("%d", &iValue1);
    
    printf("Enter ending point: ");
    scanf("%d", &iValue2);
    
    RangeDisplayRev(iValue1, iValue2);
    
    return 0;
}