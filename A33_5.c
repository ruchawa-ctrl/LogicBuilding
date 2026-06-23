#include<stdio.h>

void StrRevX(char *str)
{
    char *start = str;
    char *end = str;

    // Move the end pointer to the last character of the string
    while (*end != '\0')
    {
        end++;
    }
    end--; // Move back to the last character

    // Swap characters from start and end until they meet in the middle
    while (start < end)
    {
        char temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main()
{
    char arr[20];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter string\n");
    scanf("%[^'\n']s", arr);

    StrRevX(arr);
    printf("Reversed string is: %s\n", arr);
    return 0;
}