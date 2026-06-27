#include <stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = ~(1 << 6) & ~(1 << 9);   // toggle 7th bit to the number and 10th bit to the number
    iNo ^= iMask;  // XOR with mask to toggle the bit
    return iNo;
}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%u", &iValue);

    iRet = ToggleBit(iValue);

    printf("Modified number is : %u\n", iRet);

    return 0;
}