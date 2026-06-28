//input: 10 2
//output: 8
//take and off that bit and return the modified number


#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;
#define TRUE 1
#define FALSE 0

UINT OffBit(UINT iNo, int iPos)
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

    bRet = OffBit(iValue, iBit);

    if(bRet == TRUE)
    {
        printf("%d bit is OFF\n", iBit);
    }
    else
    {
        printf("%d bit is OFF\n", iBit);
    }

    return 0;
}