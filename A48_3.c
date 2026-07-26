#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fp;
    char FileName[30];
    char ch;

    printf("Enter file name: ");
    scanf("%s", FileName);

    fp = fopen(FileName, "r");

    if (fp == NULL)
    {
        printf("Unable to open file.\n");
        return -1;
    }

    printf("\nContents of file:\n");

    while ((ch = fgetc(fp)) != EOF)
    {
        printf("%c", ch);
    }

    fclose(fp);

    return 0;
}