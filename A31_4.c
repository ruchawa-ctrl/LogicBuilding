#include<stdio.h>
#include<stdbool.h>

bool ChkVowel(char *str)
{
    if(*str=='a'||*str=='e'||*str=='i'||*str=='o'||*str=='u')
        return true;
    else
        return false;
}

int main()
{
    char arr[20];
    bool bRet=false;
    printf("Enter string\n");
    scanf("%[^'\n']s",arr);
    bRet = ChkVowel(arr);
    if(bRet==true)
    {
        printf("String contains vowel\n");
    }
    else
    {
        printf("String does not contain vowel\n");
    }
    return 0;
}