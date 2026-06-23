#include<stdio.h>

int CountChar(char *str, char ch)
{
    int count = 0;
    while (*str != '\0')
    {
        if (*str == ch)
        {
            count++;
        }
        str++;
    }
    return count;
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
    iRet = CountChar(arr, cValue);
    printf("Character occurs %d times in the string\n", iRet);
    return 0;
}