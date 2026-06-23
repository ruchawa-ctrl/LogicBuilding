#include<stdio.h>

void StrNCpyX(char *str, char *dest, int iCnt)
{
    int i = 0;
    while (*str != '\0' && i < iCnt)
    {
        *dest = *str;
        str++;
        i++;
    }
    *dest = '\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30]; //empty string

    StrNCpyX(arr, brr, 10); // Copy first 10 characters

    printf("Copied string is: %s\n", brr);
    return 0;
}