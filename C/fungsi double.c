#include <stdio.h>

/*double fungsi yang sama seperti float yang 
akan menghasilkan floating point atau nilai pecahan*/


double fungsi1(int a, int b) {
    printf("Double yang menggunakan integer\n");
    return (a - b);
}

double fungsi2(double x, double y) {
    printf("Double yang menggunakan double\n");
    return (x - y);
}

int main() {
    printf("ini yang pertama %d\n", fungsi1(10, 20));
    printf("ini yang kedua %f\n", fungsi2(10.0, 5.2));
    return 0;
}