#include <stdio.h>

int main() {
    int a, b;
    float result;

    printf("Enter two integers: ");
    scanf("%d %d", &a, &b); // Kesalahan di sini: karena format specifier hanya satu

    result = a / b; // Potensi kesalahan lain: jika ingin menghasilkan koma, integer harus diubah ke float 
    printf("The division of %d and %d is %f\n", a, b, result);

    return 0;
}