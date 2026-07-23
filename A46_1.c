#include <stdio.h>

int WhiteSpace(char *str)
{
    if(*str == '\0')
    {
        return 0;
    }

    if(*str == ' ')
    {
        return 1 + WhiteSpace(str + 1);
    }
    else
    {
        return WhiteSpace(str + 1);
    }
}

int main()
{
    char arr[100];
    int iRet = 0;

    printf("Enter string: ");
    fgets(arr, sizeof(arr), stdin);

    iRet = WhiteSpace(arr);

    printf("%d", iRet);

    return 0;
}