// 3. Even factorial of given number
// Time Complexity : O(N)

#include<stdio.h>

int EvenFactorial(int iNo)
{
    int i = 0;
    int iFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    // Loop runs N/2 times
    for(i = iNo; i >= 1; i--)
    {
        if((i % 2) == 0)
        {
            iFact = iFact * i;
        }
    }

    return iFact;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);

    printf("Even factorial is %d\n",iRet);

    return 0;
}