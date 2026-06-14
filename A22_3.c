#include<stdio.h>

void Pattern(int iNo)
{
    int i = 0;
    
    // Loop increments from 1 up to iNo
    for(i = 1; i <= iNo; i++)
    {
        printf("%d\t*\t", i);
    }
    printf("\n");
}

int main()
{
    int iValue = 0;
    
    printf("Enter number of elements: ");
    scanf("%d", &iValue);
    
    Pattern(iValue);
    
    return 0;
}