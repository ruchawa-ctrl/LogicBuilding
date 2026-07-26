#include <stdio.h>
#include <stdlib.h>
#include <io.h>

int CountSmall(char FName[])
{
    FILE *fp = NULL;
    char ch;
    int iCount = 0;

    // Open file in read mode
    fp = fopen(FName, "r");

    // Read the data from file
    while((ch = fgetc(fp)) != EOF)
    {
        // Count small characters
        if((ch >= 'a') && (ch <= 'z'))
        {
            iCount++;
        }
    }

    // Close the file
    fclose(fp);

    // Return its frequency
    return iCount;
}

int main()
{
    char FileName[30];
    int iRet = 0;

    printf("Enter file name: ");
    scanf("%s", FileName);

    iRet = CountSmall(FileName);

    printf("Number of Small characters are %d", iRet);

    return 0;
}