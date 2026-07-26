#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fp;
    char FileName[30];
    long int size;

    printf("Enter file name: ");
    scanf("%s", FileName);

    fp = fopen(FileName, "r");

    if (fp == NULL)
    {
        printf("Unable to open file.\n");
        return -1;
    }

    fseek(fp, 0, SEEK_END);
    size = ftell(fp);

    printf("File size is %ld bytes\n", size);

    fclose(fp);

    return 0;
}