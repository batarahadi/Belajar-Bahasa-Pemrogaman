#include <stdio.h>
#include <ctype.h>   // perlu untuk toupper()

/* C toupper() Mengubah huruf biasa ke kapital */


int main() {
    char c1 = 'a';
    char c2 = 'Z';
    char c3 = '5';

    printf("%c -> %c\n", c1, toupper(c1)); // a -> A
    printf("%c -> %c\n", c2, toupper(c2)); // Z -> Z (sudah kapital)
    printf("%c -> %c\n", c3, toupper(c3)); // 5 -> 5 (bukan huruf)

    return 0;
}