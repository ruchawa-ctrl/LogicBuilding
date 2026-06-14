#include<stdio.h>

void Pattern(int iNo)
{
    int i = 0;
    
    // Loop decrements from iNo down to 1
    for(i = iNo; i >= 1; i--)
    {
        printf("%d\t#\t", i);
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