#include<stdio.h>

double FhtoCs(float fTemp)
{
    // Logic
    double dAns = 0.0;
    
    // 1 celsius = (Fahrenheit - 32) * (5/9)
    // Note: 5.0 / 9.0 forces floating-point evaluation to prevent integer division zeroing out
    dAns = (fTemp - 32) * (5.0 / 9.0);
    
    return dAns;
    
    /* Time Complexity: O(1)
    Explanation: Executing basic arithmetic operations on a single variable takes a constant amount of time.
    */
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;
    
    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fValue);
    
    dRet = FhtoCs(fValue);
    
    printf("Temperature in Celsius: %lf\n", dRet);
    
    return 0;
}