#include<stdio.h>

double CircleArea(float fRadius)
{
    // Logic
    double dAns = 0.0;
    
    // Area = PI * Radius * Radius (Given PI = 3.14)
    dAns = 3.14 * fRadius * fRadius;
    
    return dAns;
    
    /* Time Complexity: O(1)
       Explanation: The function performs a fixed set of basic multiplications 
                    which executes in constant time regardless of input value size.
    */
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;
    
    printf("Enter radius: ");
    scanf("%f", &fValue);
    
    dRet = CircleArea(fValue);
    
    printf("Area of Circle is: %lf\n", dRet);
    
    return 0;
}