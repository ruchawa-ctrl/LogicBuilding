#include<stdio.h>

double RectArea(float fWidth, float fHeight)
{
    // Logic
    double dAns = 0.0;
    
    // Area = Width * Height
    dAns = fWidth * fHeight;
    
    return dAns;
    
    /* Time Complexity: O(1)
       Explanation: Consists of a single arithmetic operation yielding a constant runtime.
    */
}

int main()
{
    float fValue1 = 0.0, fValue2 = 0.0;
    double dRet = 0.0;
    
    printf("Enter width: ");
    scanf("%f", &fValue1);
    
    printf("Enter height: ");
    scanf("%f", &fValue2);
    
    dRet = RectArea(fValue1, fValue2);
    
    printf("Area of Rectangle is: %lf\n", dRet);
    
    return 0;
}