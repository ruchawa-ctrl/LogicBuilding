#include<stdio.h>

void strtoggleX(char *str) {
    while (*str) {
        if (*str >= 'A' && *str <= 'Z') 
        {
            *str = *str + ('a' - 'A'); // Convert uppercase to lowercase
        } 
        else if (*str >= 'a' && *str <= 'z') 
        {
            *str = *str - ('a' - 'A'); // Convert lowercase to uppercase
        }
        str++;
    }
}

int main() {
    char arr[20];
    printf("Enter a string: ");
    scanf("%[^'\n']s",arr);
    strtoggleX(arr); // Toggle case
    printf("Toggled string: %s", arr); // Print the toggled string
    return 0;
}