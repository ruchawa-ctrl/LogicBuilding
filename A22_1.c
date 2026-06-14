#include<stdio.h>

void Pattern(int iNo)
{
    int i = 0;
    char ch = 'A';
    
    // Loop runs iNo times to print consecutive characters
    for(i = 0; i < iNo; i++)
    {
        printf("%c\t", ch + i);
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