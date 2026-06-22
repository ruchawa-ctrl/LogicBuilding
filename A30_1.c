#include <stdio.h>

void DisplayASCII()
{
    // Print table header with formatting widths
    printf("---------------------------------------------\n");
    printf("%-10s %-10s %-12s %-10s\n", "Decimal", "Hex", "Octal", "Symbol");
    printf("---------------------------------------------\n");

    // Loop through extended ASCII range (0 to 255)
    for (int i = 0; i <= 255; i++) 
    {
        // Format specifiers: %d = decimal, %X = uppercase hex, %o = octal
        printf("%-10d 0x%-8X 0%-11o ", i, i, i);

        // Handle printable vs non-printable characters safely
        if (i >= 32 && i <= 126) 
        {
            printf("%c\n", (char)i);
        } 
        else if (i >= 128) 
        {
            // Extended ASCII characters (depends on terminal encoding)
            printf("%c\n", (char)i);
        } 
        else 
        {
            // Non-printable control characters (0-31 and 127)
            printf("Control\n");
        }
    }
    printf("---------------------------------------------\n");
}

int main()
{
    DisplayASCII();
    
    return 0;
}