//QUESTION 1: Write a program which accept two numbers from user and return division of that two numbers.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>
    
////////////////////////////////////////////////////////////////////
// 
// Function Name :  Divide
// Input :          int,int
// Output :         int
// Description :    Performs division of 2 integers
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

int Divide(int iNo1, int iNo2)
{
    int iAns = 0;

    if(iNo2 == 0)
    {
        return -1;
    }

    iAns = iNo1 / iNo2;

    return iAns;
}
////////////////////////////////////////////////////////////////////
//
// division of two integers
//
////////////////////////////////////////////////////////////////////
int main()
{
    int iValue1 = 15, iValue2 = 5;
    int iRet = 0;

    iRet = Divide(iValue1, iValue2);

    printf("Division is %d", iRet);

    return 0;
}

//QUESTION 2: Write a program which accept number from user and display below pattern.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
// 
// Function Name :  Display
// Input :          -
// Output :         void
// Description :    Displays "Marvellous" 5 times
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////
void Display()
{
    int i = 0;

    for(i = 1; i <= 5; i++)
    {
        printf("Marvellous\n");
    }
}
////////////////////////////////////////////////////////////////////
//
// Application to display "Marvellous" 5 times
//
////////////////////////////////////////////////////////////////////
int main()
{
    Display();

    return 0;
}

//QUESTION 3: Write a program which accept number from user and display below pattern.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
// 
// Function Name :  Display
// Input :          -
// Output :         void
// Description :    Displays 5 to 1 on screen
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////
void Display()
{
    int i = 0;

    i = 5;

    while(i >= 1)
    {
        printf("%d\n", i);
        i--;
    }
}
////////////////////////////////////////////////////////////////////
//
// Application to display 5 to 1 on screen
//
////////////////////////////////////////////////////////////////////
int main()
{
    Display();

    return 0;
}

//QUESTION 5: Write a program which accept two numbers from user and return division of that two numbers.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

////////////////////////////////////////////////////////////////////
// 
// Function Name :  Check
// Input :          int
// Output :         BOOL
// Description :    Checks if a number is divisible by 5
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

BOOL Check(int iNo)
{
    if((iNo % 5) == 0)
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
// Application to check if a number is divisible by 5
//
////////////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number\n");
    scanf("%d", &iValue);

    bRet = Check(iValue);

    if(bRet == TRUE)
    {
        printf("Divisible by 5");
    }
    else
    {
        printf("Not Divisible by 5");
    }

    return 0;
}

//QUESTION 5: Write a program which accept two numbers from user and return division of that two numbers.
////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////
// 
// Function Name :  Accept
// Input :          int
// Output :         void
// Description :    Displays asterisks
// Date :           22/05/2026
// Author :         Rucha Raghav Wavekar
//
////////////////////////////////////////////////////////////////////

void Accept(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("*");
    }
}
////////////////////////////////////////////////////////////////////
//
// Application to display asterisks
//
////////////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;

    iValue = 5;

    Accept(iValue);

    return 0;
}