#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkZero(int iNo)
{
    int iDigit = 0;
    
    // Handle the explicit case where the user inputs 0
    if(iNo == 0)
    {
        return TRUE;
    }
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 0)
        {
            return TRUE; // Zero found immediately, early exit
        }
        iNo = iNo / 10;
    }
    
    return FALSE;
    
    /* Time Complexity: O(N) where N is the number of digits.
       Explanation: In the worst-case scenario (no zero or zero at the front), 
                    we inspect every digit once.
    */
}

int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    bRet = ChkZero(iValue);
    
    if(bRet == TRUE)
    {
        printf("It Contains Zero\n");
    }
    else
    {
        printf("There is no Zero\n");
    }
    
    return 0;
}