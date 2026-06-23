#include<stdio.h>

void StrCpyX(char *str, char *dest)
{
    while (*str != '\0')
    {
        *dest = *str;
        str++;
        dest++;
    }
    *dest = '\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30]; //empty string

    StrCpyX(arr, brr);

    printf("Copied string is: %s\n", brr);
    return 0;
}