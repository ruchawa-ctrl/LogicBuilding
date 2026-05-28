#include<stdio.h>

double SquareMeter(int iValue)
{
    // Logic
    double dAns = 0.0;
    
    // 1 square feet = 0.0929 Square meter
    dAns = iValue * 0.0929;
    
    return dAns;
    
    /* Time Complexity: O(1)
    Explanation: Simple mathematical scaling that finishes in constant CPU clock cycles.
    */
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;
    
    printf("Enter area in square feet: ");
    scanf("%d", &iValue);
    
    dRet = SquareMeter(iValue);
    
    printf("Area in Square Meters: %lf\n", dRet);
    
    return 0;
}