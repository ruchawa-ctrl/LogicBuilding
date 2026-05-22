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

    printf("Enter number");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}

//QUESTION 2: Accept one number from user and print that number of * on screen.
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
    // Write Updater
    while(iNo > 0)
    {
        printf("* ");
        iNo--;
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

    printf("Enter number\n");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}

//QUESTION 3: Accept one number from user. If number is less than 10 then print "Hello" otherwise print "Demo".
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
// Description :    Prints Hello or Demo
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    if(iNo < 10)
    {
        printf("Hello");
    }
    else
    {
        printf("Demo");
    }
}

////////////////////////////////////////////////////////////////////
//
// Application to display result
//
////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}

//QUESTION 4: Accept two numbers from user and display first number second number of times.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
//
// Function Name :  Display
// Input :          int, int
// Output :         void
// Description :    Displays number on screen
//
////////////////////////////////////////////////////////////////////

void Display(int iNo, int iFrequency)
{
    int iCnt = 0;

    while(iCnt < iFrequency)
    {
        printf("%d\t", iNo);
        iCnt++;
    }
}

////////////////////////////////////////////////////////////////////
//
// Application to display numbers
//
////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;
    int iC = 0;

    printf("Enter number\n");
    scanf("%d", &iValue);

    printf("Enter frequency\n");
    scanf("%d", &iC);

    //Display(iValue, iC);

    return 0;
}

//QUESTION 5: Accept number from user and check whether number is even or odd.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

////////////////////////////////////////////////////////////////////
//
// Function Name :  ChkEven
// Input :          int
// Output :         BOOL
// Description :    Checks whether number is even or odd
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

BOOL ChkEven(int iNo)
{
    // Logic
    if((iNo % 2) == 0)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

////////////////////////////////////////////////////////////////////
//
// Application to check even or odd number
//
////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number\n");
    scanf("%d", &iValue);

    bRet = ChkEven(iValue);

    // Display result
    if(bRet == TRUE)
    {
        printf("Number is Even");
    }
    else
    {
        printf("Number is Odd");
    }

    return 0;
}

