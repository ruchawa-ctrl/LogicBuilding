#include<stdio.h>

void StrCpyCap(char *str, char *dest)
{
    int i = 0;
    while (*str != '\0')
    {
        if (*str >= 'A' && *str <= 'Z') // Check if the character is uppercase
        {
            *dest = *str; // Copy uppercase character to destination
            dest++;
        }
        str++;
    }
    *dest = '\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30]; //empty string

    StrCpyCap(arr, brr); // Copy the entire string

    printf("Copied string is: %s\n", brr);
    return 0;
}