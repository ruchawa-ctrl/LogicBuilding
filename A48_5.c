#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fp;
    char FileName[30];
    char str[100];

    printf("Enter file name: ");
    scanf("%s", FileName);

    fp = fopen(FileName, "a");

    if (fp == NULL)
    {
        printf("Unable to open file.\n");
        return -1;
    }

    getchar(); // Removes newline left by scanf

    printf("Enter string: ");
    fgets(str, sizeof(str), stdin);

    fputs(str, fp);

    printf("String written successfully.\n");

    fclose(fp);

    return 0;
}