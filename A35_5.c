#include <stdio.h>
typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    // Implementation for checking a specific bit 1st and last  position
    if((iNo & (1 << 0)) != 0) // 1st bit (0-indexed)
    {
        return TRUE;
    }
    if((iNo & (1 << 31)) != 0) // last bit (0-indexed)
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
