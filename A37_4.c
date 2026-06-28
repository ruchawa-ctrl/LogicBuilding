//input: 10 3
//output: 14
//take and toggle that bit and return the modified number


#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;
#define TRUE 1
#define FALSE 0

UINT ToggleBit(UINT iNo, int iPos)
{
    UINT iMask = 0x00000001;
    UINT iResult = 0;

    if((iPos < 1) || (iPos > 32))
    {
        printf("Invalid position\n");
        return FALSE;
    }

    iMask = iMask << (iPos - 1);
    iResult = iNo & iMask;

    if(iResult == iMask)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    UINT iValue = 0;
    int iBit = 0;
    BOOL bRet = FALSE;

    printf("Enter number\n");
    scanf("%u", &iValue);

    printf("Enter position\n");
    scanf("%d", &iBit);

    bRet = ToggleBit(iValue, iBit);

    if(bRet == TRUE)
    {
        printf("%d bit is ON\n", iBit);
    }
    else
    {
        printf("%d bit is OFF\n", iBit);
    }

    return 0;
}