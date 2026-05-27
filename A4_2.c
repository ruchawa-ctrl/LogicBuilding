#include<stdio.h>

void FactRev(int iNo)
{
    int iCnt = 0;

    // Time Complexity : O(N)
    // Loop runs from iNo/2 to 1

    for(iCnt = iNo / 2; iCnt >= 1; iCnt--)
    {
        if((iNo % iCnt) == 0)
        {
            printf("%d\t",iCnt);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    FactRev(iValue);

    return 0;
}