#include<stdio.h>

int KMtoMeter(int iNo)
{
    // Logic
    int iAns = 0;
    
    // 1 kilometer = 1000 Meter
    iAns = iNo * 1000;
    
    return iAns;
    
    /* Time Complexity: O(1)
    Explanation: The input is simply scaled by a fixed integer constant in a single operational step.
    */
}

int main()
{
    int iValue = 0, iRet = 0;
    
    printf("Enter distance: ");
    scanf("%d", &iValue);
    
    iRet = KMtoMeter(iValue);
    
    printf("Distance in Meters: %d\n", iRet);
    
    return 0;
}