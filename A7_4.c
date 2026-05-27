// 4. Display table of number
// Time Complexity : O(1)

#include<stdio.h>

void Table(int iNo)
{
    int i = 0;

    // Loop runs fixed 10 times
    for(i = 1; i <= 10; i++)
    {
        printf("%d\t", iNo * i);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Table(iValue);

    return 0;
}