#include<stdio.h>

int FirstChar(char *str, char ch)
{
    int count = 0;
    while (*str != '\0')
    {
        if (*str == ch)
        {
            return count;
        }
        str++;
    }
    return -1;
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
    iRet = FirstChar(arr, cValue);
    printf("First occurrence of character is at position %d\n", iRet);
    return 0;
}