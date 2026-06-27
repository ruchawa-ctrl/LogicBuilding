#include <stdio.h>
typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    // Implementation for checking a specific bit 7th and 15th and 21st and 28th  position
    if((iNo & (1 << 6)) != 0) // 7th bit (0-indexed)
    {
        return TRUE;
    }
    if((iNo & (1 << 14)) != 0) // 15th bit (0-indexed)
    {
        return TRUE;
    }
    if((iNo & (1 << 20)) != 0) // 21st bit (0-indexed)
    {
        return TRUE;
    }
    if((iNo & (1 << 27)) != 0) // 28th bit (0-indexed)
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
