//input: 10 3
//output: 14
//take and toggle that bit of first and last nibble and return the modified number


#include <stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0xF000000F;   // Toggle first and last nibble

    return (iNo ^ iMask);
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