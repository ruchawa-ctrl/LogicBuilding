#include <stdio.h>

typedef unsigned int UINT;

void CommonBits(UINT iNo1, UINT iNo2)
{
    UINT iResult = 0;
    int iPos = 1;

    iResult = iNo1 & iNo2;

    while(iResult != 0)
    {
        if((iResult & 1) == 1)
        {
            printf("%d\t", iPos);
        }

        iResult = iResult >> 1;
        iPos++;
    }
}

int main()
{
    UINT iValue1 = 0, iValue2 = 0;

    printf("Enter first number : ");
    scanf("%u", &iValue1);

    printf("Enter second number : ");
    scanf("%u", &iValue2);

    printf("Common ON bit positions are : ");
    CommonBits(iValue1, iValue2);

    return 0;
}