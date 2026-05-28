#include<stdio.h>

void RangeDisplay(int iStart, int iEnd)
{
    // Filter out invalid range where start point is greater than end point
    if(iStart > iEnd)
    {
        printf("Invalid range\n");
        return;
    }
    
    // Loop through and print every integer within the boundary bounds
    for(int iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        printf("%d ", iCnt);
    }
    printf("\n");
    
    /* Time Complexity: O(N) where N is the total elements in the range (iEnd - iStart + 1).
       Explanation: The iteration scales linearly based directly on the width of the range gap.
    */
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    
    printf("Enter starting point: ");
    scanf("%d", &iValue1);
    
    printf("Enter ending point: ");
    scanf("%d", &iValue2);
    
    RangeDisplay(iValue1, iValue2);
    
    return 0;
}