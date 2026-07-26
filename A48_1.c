#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fp;
    char FileName[30];

    printf("Enter file name: ");
    scanf("%s", FileName);

    fp = fopen(FileName, "r");

    if (fp == NULL)
    {
        printf("Unable to open file.\n");
    }
    else
    {
        printf("File opened successfully.\n");
        fclose(fp);
    }

    return 0;
}