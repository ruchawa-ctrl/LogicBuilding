#include <stdio.h>
typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    // Implementation for checking a specific bit 15th bit position
       
    for(int i = 0; i < 32; i++)
    {
        if((iNo & (1 << i)) != 0)
        {
            return TRUE; // Bit is ON
        }
    }
    return FALSE; // Bit is OFF
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
