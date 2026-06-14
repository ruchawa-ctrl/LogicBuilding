#include<stdio.h>

void Pattern(int iNo)
{
    int i = 0;
    
    // Multiplying the iterator by 2 yields sequential even numbers
    for(i = 1; i <= iNo; i++)
    {
        printf("%d\t", i * 2);
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