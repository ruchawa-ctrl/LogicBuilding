#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fp;
    char FileName[30];

    printf("Enter file name: ");
    scanf("%s", FileName);

    fp = fopen(FileName, "w");

    if (fp == NULL)
    {
        printf("Unable to create file.\n");
    }
    else
    {
        printf("File created successfully.\n");
        fclose(fp);
    }

    return 0;
}