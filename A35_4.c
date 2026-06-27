#include <stdio.h>
typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    // Implementation for checking a specific bit 7th and 8th and 9th position
    if((iNo & (1 << 6)) != 0) // 7th bit (0-indexed)
    {
        return TRUE;
    }
    if((iNo & (1 << 7)) != 0) // 8th bit (0-indexed)
    {
        return TRUE;
    }
    if((iNo & (1 << 8)) != 0) // 9th bit (0-indexed)
    {
        return TRUE;
    }
    return FALSE;
}

int main()
{
    UINT iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number: \n");
    scanf("%lu", &iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("Bit is ON\n");
    }
    else
    {
        printf("Bit is OFF\n");
    }

    return 0;
}
