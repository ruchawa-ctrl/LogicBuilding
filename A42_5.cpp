#include<iostream>
using namespace std;

template<class T>
void Reverse(T *arr, int iSize)
{
    int iStart = 0;
    int iEnd = iSize - 1;

    while(iStart < iEnd)
    {
        T temp;

        temp = arr[iStart];
        arr[iStart] = arr[iEnd];
        arr[iEnd] = temp;

        iStart++;
        iEnd--;
    }
}

int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};

    cout<<"Before reverse : ";
    for(int i = 0; i < 9; i++)
    {
        cout<<arr[i]<<" ";
    }

    Reverse(arr,9);

    cout<<"\nAfter reverse : ";
    for(int i = 0; i < 9; i++)
    {
        cout<<arr[i]<<" ";
    }

    return 0;
}