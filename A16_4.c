#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[], int iLength)
{
    int i = 0;
    int iNum = 0;

    printf("Numbers having 3 digits are : ");

    for(i = 0; i < iLength; i++)
    {
        iNum = Arr[i];

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        if(iNum >= 100 && iNum <= 999)
        {
            printf("%d\t",Arr[i]);
        }
    }
}

int main()
{
    int iSize = 0, iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements : \n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : ",iCnt + 1);
        scanf("%d",&p[iCnt]);
    }

    Digits(p,iSize);

    free(p);

    return 0;
}