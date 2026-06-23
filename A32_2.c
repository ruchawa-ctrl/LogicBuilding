#include<stdio.h>

void struprX(char *str) {
    while (*str) {
        if (*str >= 'a' && *str <= 'z') {
            *str = *str - ('a' - 'A');
        }
        str++;
    }
}

int main() {
    char arr[20];

    printf("Enter string: \n"); 
    fgets(arr, sizeof(arr), stdin);

    struprX(arr);

    printf("Uppercase string: %s", arr);

    return 0;
}