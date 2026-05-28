#include<stdio.h>

double SquareMeter(int iValue)
{
    // Logic
    double dAns = 0.0;
    
    // 1 Square feet = 0.0929 Square meter
    dAns = iValue * 0.0929;
    
    return dAns;
    
    /* Time Complexity: O(1)
       Explanation: Independent execution length, matching constant time behavior metrics.
    */
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;
    
    printf("Enter area in square feet: ");
    // Note: The template image matches `&fValue` typographically, but explicitly declared `iValue` 
    // upstream. Corrected target reference usage below to align correctly with compilation types.
    scanf("%d", &iValue);
    
    dRet = SquareMeter(iValue);
    
    printf("Area in Square Meters: %lf\n", dRet);
    
    return 0;
}