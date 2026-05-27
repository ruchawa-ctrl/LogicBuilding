#include<stdio.h>

void OddDisplay(int iNo)
{
    int i = 0;

    for(i = 1; i <= iNo; i = i + 2)
    {
        printf("%d\t",i);
    }

    // Time Complexity : O(N)
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    OddDisplay(iValue);

    return 0;
}