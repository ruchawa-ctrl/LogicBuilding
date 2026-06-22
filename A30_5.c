#include<stdio.h>

void Display(char ch)
{
    printf("ASCII value of %c is %d\n",ch,ch);
    printf("ASCII value in octal is %o\n",ch);
    printf("ASCII value in hexadecimal is %x\n",ch);
}

int main()
{
    char cValue = '\0';

    printf("Enter a character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}