#include<stdio.h>

void Reverse(char *str)
{
    char *start = str;
    char *end = str;
    char temp;

    // 1. Move the 'end' pointer to the last character of the string
    while (*end != '\0')
    {
        end++;
    }
    end--; // Step back one position to point to the actual character before '\0'

    // 2. Swap characters from both ends moving inward
    while (start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string\n");
    scanf("%[^'\n']s",arr);

    Reverse(arr);
    printf("Reversed string is: %s\n", arr);

    return 0;
}