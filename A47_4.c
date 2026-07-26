#include <stdio.h>
#include <stdlib.h>

int CountChar(char FName[], char Ch)
{
    FILE *fp;
    char c;
    int count = 0;

    fp = fopen(FName, "r");

    if (fp == NULL)
    {
        printf("Unable to open file.\n");
        return -1;
    }

    while ((c = fgetc(fp)) != EOF)
    {
        if (c == Ch)
            count++;
    }

    fclose(fp);

    return count;
}

int main()
{
    char FileName[30];
    int iRet = 0;
    char cValue;

    printf("Enter file name: ");
    scanf("%s", FileName);

    printf("Enter the character: ");
    scanf(" %c", &cValue);      // Space before %c skips newline

    iRet = CountChar(FileName, cValue);

    if (iRet != -1)
        printf("Frequency is %d\n", iRet);

    return 0;
}