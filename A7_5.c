// 5. Display table in reverse order
// Time Complexity : O(1)

#include<stdio.h>

void TableRev(int iNo)
{
    int i = 0;

    // Loop runs fixed 10 times
    for(i = 10; i >= 1; i--)
    {
        printf("%d\t", iNo * i);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    TableRev(iValue);

    return 0;
}