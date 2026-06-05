#include<stdio.h>
#include<stdlib.h>

/////////////////////////////////////////////////////////////////
//
// Function Name : Product
// Input         : Integer Array, Size
// Output        : Integer
// Description   : Returns product of all odd elements
// Time Complexity : O(N)
//
/////////////////////////////////////////////////////////////////

int Product(int Arr[], int iLength)
{
    int i = 0;
    int iProduct = 1;
    int iCountOdd = 0;

    for(i = 0; i < iLength; i++)
    {
        if((Arr[i] % 2) != 0)
        {
            iProduct = iProduct * Arr[i];
            iCountOdd++;
        }
    }

    if(iCountOdd == 0)
    {
        return 0;
    }

    return iProduct;
}

int main()
{
    int iSize = 0, iRet = 0, iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

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

    iRet = Product(p, iSize);

    printf("Product is %d",iRet);

    free(p);

    return 0;
}