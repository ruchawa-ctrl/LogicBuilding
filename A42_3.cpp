#include<iostream>
using namespace std;

template <class T>
int SearchFirst(T *arr, int iSize, T iNo)
{
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        if(arr[i] == iNo)
        {
            return (i + 1);   // Position (1-based)
        }
    }

    return -1;   // Element not found
}

int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};

    int iRet = SearchFirst(arr,9,40);

    cout << iRet << endl;

    return 0;
}