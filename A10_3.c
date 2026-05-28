#include<stdio.h>

int KMtoMeter(int iNo)
{
    // Logic
    int iAns = 0;
    
    // 1 Kilometer = 1000 Meters
    iAns = iNo * 1000;
    
    return iAns;
    
    /* Time Complexity: O(1)
       Explanation: Directly calculates the linear translation value in a single CPU cycle step.
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