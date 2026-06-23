#include<stdio.h>

void StrCatX(char *str, char *dest)
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
    while (*dest != '\0') // Move to the end of the destination string
    {
        dest++;
    }
    *dest = '\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30]; //empty string

    StrCatX(arr, brr); // Concatenate the strings

    printf("Concatenated string is: %s\n", brr);
    return 0;
}