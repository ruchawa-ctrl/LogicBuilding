void Display(char ch)
{
     if((ch >= 'a') && (ch <= 'z'))
    {
        ch = ch - 32;      // Convert small to capital
    }
    else if((ch >= 'A') && (ch <= 'Z'))
    {
        ch = ch + 32;      // Convert capital to small
    }

    printf("%c\n", ch);
}

int main()
{
    char cValue = '\0';

    printf("Enter character: \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}