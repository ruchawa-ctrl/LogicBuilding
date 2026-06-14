#include<stdio.h>

void Pattern(int iNo)
{
    int i = 0;
    
    // Loop prints the combination pattern in each iteration
    for(i = 1; i <= iNo; i++)
    {
        printf("#\t%d\t*\t", i);
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