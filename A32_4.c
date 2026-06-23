#include<stdio.h>

void DisplayDigit(char *str)
{
    while (*str) {
        if (*str >= '0' && *str <= '9') {
            printf("%c", *str);
        }
        str++;
    }
}

int main()
{
    char arr[20];

    printf("Enter a string: ");
    scanf("%[^'\n']s",arr);

    DisplayDigit(arr);
    return 0;
}