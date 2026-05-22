//QUESTION 1: Accept one number from user and print that number of * on screen.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
//
// Function Name :  Display
// Input :          int
// Output :         void
// Description :    Displays * on screen
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    int iCnt = 0;

    // Write Updater
    while(iCnt < iNo)
    {
        printf("* ");
        iCnt++;
    }
}

////////////////////////////////////////////////////////////////////
//
// Application to display * on screen
//
////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}

//QUESTION 2: Accept one number from user and print even numbers on screen.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
//
// Function Name :  PrintEven
// Input :          int
// Output :         void
// Description :    Displays even numbers on screen
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

void PrintEven(int iNo)
{
    int iCnt = 1;

    // Write Updater
    while(iCnt <= iNo)
    {
        printf("%d\t", iCnt * 2);
        iCnt++;
    }
}

////////////////////////////////////////////////////////////////////
//
// Application to display even numbers on screen
//
////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    PrintEven(iValue);

    return 0;
}

//QUESTION 3: Accept one number from user and print factors of that number.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
//
// Function Name :  DisplayFactor
// Input :          int
// Output :         void
// Description :    Displays factors of number
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

void DisplayFactor(int iNo)
{
    int iCnt = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    // Write Updater
    while(iCnt <= iNo)
    {
        if(iNo % iCnt == 0)
        {
            printf("%d\t", iCnt);
        }

        iCnt++;
    }
}

////////////////////////////////////////////////////////////////////
//
// Application to display factors of number
//
////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    DisplayFactor(iValue);

    return 0;
}

//QUESTION 4: Accept one number from user and print even factors of that number.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
//
// Function Name :  DisplayEvenFactor
// Input :          int
// Output :         void
// Description :    Displays even factors of number
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

void DisplayEvenFactor(int iNo)
{
    int iCnt = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    // Write Updater
    while(iCnt <= iNo)
    {
        if((iNo % iCnt == 0) && (iCnt % 2 == 0))
        {
            printf("%d\t", iCnt);
        }

        iCnt++;
    }
}

////////////////////////////////////////////////////////////////////
//
// Application to display even factors of number
//
////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    DisplayEvenFactor(iValue);

    return 0;
}

//QUESTION 5: Accept one character from user and convert case of that character.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
//
// Function Name :  DisplayConvert
// Input :          char
// Output :         void
// Description :    Converts case of character
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

void DisplayConvert(char cValue)
{
    if((cValue >= 'a') && (cValue <= 'z'))
    {
        printf("%c", cValue - 32);
    }
    else if((cValue >= 'A') && (cValue <= 'Z'))
    {
        printf("%c", cValue + 32);
    }
}

////////////////////////////////////////////////////////////////////
//
// Application to convert case of character
//
////////////////////////////////////////////////////////////////////

int main()
{
    char cValue = '\0';

    printf("Enter character : ");
    scanf("%c", &cValue);

    DisplayConvert(cValue);

    return 0;
}

