#include<stdio.h>
#include<stdlib.h>

/////////////////////////////////////////////////////////////////
//
// Function Name : Range
// Input         : Integer Array, Size, Start, End
// Output        : void
// Description   : Displays elements between given range
// Time Complexity : O(N)
//
/////////////////////////////////////////////////////////////////

void Range(int Arr[], int iLength, int iStart, int iEnd)
{
    int i = 0;

    printf("Elements in range are : ");

    for(i = 0; i < iLength; i++)
    {
        if((Arr[i] >= iStart) && (Arr[i] <= iEnd))
        {
            printf("%d\t",Arr[i]);
        }
    }
}

int main()
{
    int iSize = 0, iCnt = 0;
    int iValue1 = 0, iValue2 = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

    printf("Enter the starting point : ");
    scanf("%d",&iValue1);

    printf("Enter the ending point : ");
    scanf("%d",&iValue2);

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

    Range(p, iSize, iValue1, iValue2);

    free(p);

    return 0;
}