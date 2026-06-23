#include<stdio.h>

int LastChar(char *str, char ch)
{
    int count = 0;
    int lastPosition = -1;
    while (*str != '\0')
    {
        if (*str == ch)
        {
            lastPosition = count;
        }
        str++;
    }
    return lastPosition;
}

int main()
{
    char arr[20];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter string\n");
    scanf("%[^'\n']s", arr);

    printf("Enter the character\n");
    scanf(" %c", &cValue);
    iRet = LastChar(arr, cValue);
    printf("Last occurrence of character is at position %d\n", iRet);
    return 0;
}