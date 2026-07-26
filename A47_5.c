#include <stdio.h>
#include <stdlib.h>

void DisplayN(char FName[], int iSize)
{
    FILE *fp;
    char ch;
    int i;

    fp = fopen(FName, "r");

    if (fp == NULL)
    {
        printf("Unable to open file.\n");
        return;
    }

    printf("\nFirst %d characters are:\n", iSize);

    for (i = 0; i < iSize; i++)
    {
        ch = fgetc(fp);

        if (ch == EOF)
            break;

        printf("%c", ch);
    }

    fclose(fp);
}

int main()
{
    char FileName[30];
    int iValue = 0;

    printf("Enter file name: ");
    scanf("%s", FileName);

    printf("Enter the number of characters: ");
    scanf("%d", &iValue);

    DisplayN(FileName, iValue);

    return 0;
}