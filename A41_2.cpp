#include <iostream>
using namespace std;

template <class T>
T Max(T no1, T no2, T no3)
{
    T ans;

    if(no1 > no2 && no1 > no3)
    {
        ans = no1;
    }
    else if(no2 > no1 && no2 > no3)
    {
        ans = no2;
    }
    else
    {
        ans = no3;
    }

    return ans;
}

int main()
{
    int iRet = Max(10, 20, 30);
    cout << iRet << endl;

    float fRet = Max(10.5f, 20.5f, 15.5f);
    cout << fRet << endl;

    return 0;
}