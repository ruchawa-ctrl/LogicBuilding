
#define TRUE 1
#define FALSE 0

typedef int BOOL;

void DisplaySchedule(char chDiv)
{
    switch(chDiv)
    {
        case 'A':
        case 'a':
            printf("Your exam is at 7:00 AM\n");
            break;

        case 'B':
        case 'b':
            printf("Your exam is at 8:30 AM\n");
            break;

        case 'C':
        case 'c':
            printf("Your exam is at 9:20 AM\n");
            break;

        case 'D':
        case 'd':
            printf("Your exam is at 10:30 AM\n");
            break;

        default:
            printf("Invalid division\n");
    }
}

int main()
{
    char cValue;
    BOOL bRet = FALSE;

    printf("Enter the division (A, B, C, D) : \n");
    scanf("%c", &cValue);       

    bRet = DisplaySchedule(cValue); 

    return 0;
}