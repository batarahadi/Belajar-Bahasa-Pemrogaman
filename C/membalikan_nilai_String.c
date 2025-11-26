#include <stdio.h>
#include <string.h>
// Deklarasi fungsi
void reverseString(char str[], int start, int end);

int main() {
    char str[100];
    
    printf("Enter a string: ");
    gets(str);
    reverseString(str, 0, strlen(str) - 1);
    printf("Reversed string: %s\n", str);
    return 0;
}
// Definisi fungsi
void reverseString(char str[], int start, int end) {
    if (start >= end) {
    return;
    }
    char temp = str[start];
    str[start] = str[end];
    str[end] = temp;
    reverseString(str, start + 1, end - 1);
}

#include <stdio.h>
#include <string.h>

// Deklarasi fungsi
void reverseString(char str[], int start, int end);

int main() {
    char str[100];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    str[strcspn(str, "\n")] = '\0'; // menghapus newline

    reverseString(str, 0, strlen(str) - 1);

    printf("Reversed string: %s\n", str);

    return 0;
}

// Definisi fungsi rekursi
void reverseString(char str[], int start, int end) {
    if (start >= end) {
        return;
    }

    char temp = str[start];
    str[start] = str[end];
    str[end] = temp;

    reverseString(str, start + 1, end - 1);
}
