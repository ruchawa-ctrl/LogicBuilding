#include <stdio.h>

int Fact(int iNo)
{
    if(iNo == 1 || iNo == 0)
    {
        return 1;
    }

    return iNo * Fact(iNo - 1);
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = Fact(iValue);

    printf("%d", iRet);

    return 0;
}