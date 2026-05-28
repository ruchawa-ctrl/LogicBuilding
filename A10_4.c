#include<stdio.h>

double FhtoCs(float fTemp)
{
    // Logic
    double dAns = 0.0;
    
    // Celsius = (Fahrenheit - 32) * (5/9)
    // Note: 5.0 / 9.0 forces float division to prevent integer truncation to 0
    dAns = (fTemp - 32) * (5.0 / 9.0);
    
    return dAns;
    
    /* Time Complexity: O(1)
       Explanation: Subtraction and scaling evaluate instantly within constant boundary limits.
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