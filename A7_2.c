// 2. Convert USD to INR
// Time Complexity : O(1)

#include<stdio.h>

int DollarToINR(int iNo)
{
    // Constant time operation
    return iNo * 70;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number of USD : ");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);

    printf("Value in INR is %d\n",iRet);

    return 0;
}