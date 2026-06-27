#include <stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT iMask = ~(1 << 6) & ~(1 << 9);   // Mask to OFF 7th and 10th bit
    return (iNo & iMask);
}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%u", &iValue);

    iRet = OffBit(iValue);

    printf("Modified number is : %u\n", iRet);

    return 0;
}