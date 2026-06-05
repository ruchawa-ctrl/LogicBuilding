#include<stdio.h>
#include<stdlib.h>

/////////////////////////////////////////////////////////////////
//
// Function Name : LastOcc
// Input         : Integer Array, Size, Number
// Output        : Integer
// Description   : Returns index of last occurrence of number
// Time Complexity : O(N)
//
/////////////////////////////////////////////////////////////////

int LastOcc(int Arr[], int iLength, int iNo)
{
    int i = 0;
    int iPos = -1;

    for(i = 0; i < iLength; i++)
    {
        if(Arr[i] == iNo)
        {
            iPos = i;
        }
    }

    return iPos;
}

int main()
{
    int iSize = 0, iRet = 0, iCnt = 0, iValue = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

    printf("Enter the number : ");
    scanf("%d",&iValue);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : ",iCnt + 1);
        scanf("%d",&p[iCnt]);
    }

    iRet = LastOcc(p, iSize, iValue);

    if(iRet == -1)
    {
        printf("There is no such number");
    }
    else
    {
        printf("Last occurrence of number is at index : %d",iRet);
    }

    free(p);

    return 0;
}