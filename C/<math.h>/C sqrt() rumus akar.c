#include <stdio.h>
#include <math.h>   // perlu ini untuk sqrt() -> square root artinya akar kuadrat

/* Program ini menghitung akar kuadrat dari sebuah 
bilangan menggunakan fungsi sqrt() dari <math.h> */

int main() {
    double x = 16.0;
    double hasil = sqrt(x);

    printf("Akar kuadrat dari %.0f adalah %.2f\n", x, hasil); // Akar kuadrat dari 16 adalah 4.00


    return 0;
}