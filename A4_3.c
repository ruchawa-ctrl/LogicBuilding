#include<stdio.h>

void NonFact(int iNo)
{
    int iCnt = 0;

    // Time Complexity : O(N)
    // Loop runs from 1 to iNo-1

    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt) != 0)
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

    NonFact(iValue);

    return 0;
}