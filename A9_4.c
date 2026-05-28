#include<stdio.h>

int MultDigits(int iNo)
{
    int iDigit = 0;
    int iMul = 1;
    int bHasDigits = 0;
    
    // Handle input being exactly 0
    if(iNo == 0)
    {
        return 0;
    }
    
    // Handle negative numbers
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        
        // Skip zero to avoid wiping out the whole product calculation 
        // as demonstrated in the test case: Input 9440 -> Output 144 (9 * 4 * 4)
        if(iDigit != 0)
        {
            iMul = iMul * iDigit;
            bHasDigits = 1;
        }
        iNo = iNo / 10;
    }
    
    return bHasDigits ? iMul : 0;
    
    /* Time Complexity: O(N) where N is the total number of digits.
       Processes one digit per iteration by truncating the last place value.
    */
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    iRet = MultDigits(iValue);
    
    printf("Multiplication of digits is: %d\n", iRet);
    
    return 0;
}