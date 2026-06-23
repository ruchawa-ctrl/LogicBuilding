#include<stdio.h>

int CountWhite(char *str)
{
    int count = 0;
    while (*str != '\0')
    {
        if (*str == ' ')
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
    int iRet = 0;

    printf("Enter string\n");
    scanf("%[^'\n']s", arr);

    iRet = CountWhite(arr);
    printf("Number of white spaces are : %d\n", iRet);
    return 0;
}