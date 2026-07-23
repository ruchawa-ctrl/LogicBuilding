#include <stdio.h>

int Strlen(char *str)
{
    if(*str == '\0')
    {
        return 0;
    }

    return 1 + Strlen(str + 1);
}

int main()
{
    int iRet = 0;
    char arr[20];

    printf("Enter string: ");
    scanf("%s", arr);

    iRet = Strlen(arr);

    printf("%d", iRet);

    return 0;
}