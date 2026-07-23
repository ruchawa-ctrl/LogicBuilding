#include <stdio.h>

int Max(int iNo)
{
    int iDigit = 0;
    int iMax = 0;

    if(iNo == 0)
    {
        return 0;
    }

    iDigit = iNo % 10;
    iMax = Max(iNo / 10);

    if(iDigit > iMax)
    {
        return iDigit;
    }

    return iMax;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = Max(iValue);

    printf("%d", iRet);

    return 0;
}