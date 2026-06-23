#include<stdio.h>

void StrCpySmall(char *str, char *dest)
{
    int i = 0;
    while (*str != '\0')
    {
        if (*str >= 'a' && *str <= 'z') // Check if the character is lowercase
        {
            *dest = *str; // Copy lowercase character to destination
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

    StrCpySmall(arr, brr); // Copy the entire string

    printf("Copied string is: %s\n", brr);
    return 0;
}