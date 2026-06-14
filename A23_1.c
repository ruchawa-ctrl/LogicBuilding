#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0; // Iterator for rows
    int j = 0; // Iterator for columns
    
    // Outer loop for rows
    for(i = 1; i <= iRow; i++)
    {
        // Inner loop for columns
        for(j = 1; j <= iCol; j++)
        {
            printf("*\t");
        }
        // Move to the next line after printing all columns of the current row
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    
    printf("Enter number of rows and columns: ");
    // Fixed formatting for standard double quotes
    scanf("%d %d", &iValue1, &iValue2);
    
    Pattern(iValue1, iValue2);
    
    return 0;
}