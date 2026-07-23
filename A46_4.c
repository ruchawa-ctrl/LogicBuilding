#include <stdio.h>

int Min(int iNo)
{
    int iDigit = 0;
    int iMin = 0;

    if(iNo < 10)
    {
        return iNo;
    }

    iDigit = iNo % 10;
    iMin = Min(iNo / 10);

    if(iDigit < iMin)
    {
        return iDigit;
    }

    return iMin;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = Min(iValue);

    printf("%d", iRet);

    return 0;
}