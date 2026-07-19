#include <iostream>
using namespace std;

template <class T>
T AddN(T *arr, int iSize)
{
    T ans = 0;

    for(int i = 0; i < iSize; i++)
    {
        ans = ans + arr[i];
    }

    return ans;
}

int main()
{
    int Arr[] = {10, 20, 30, 40, 50};

    int iRet = AddN(Arr, 5);

    cout << "Addition is: " << iRet << endl;

    return 0;
}