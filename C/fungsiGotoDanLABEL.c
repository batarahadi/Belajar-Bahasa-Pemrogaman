// Fungsi Goto dan Label
// LABEL tidak harus huruf Besar tetapi harus diakhiri dengan titik dua (:)
// Goto digunakan untuk lompat ke LABEL tertentu



#include <stdio.h>
#include <math.h>
int main() {
    int a = 1;

    if ( a % 2 == 0) {
        EVEN:
            printf("Even\n");
            goto BERAKHIR;
    }
    else {
        ANEH:
            printf("Odd\n");
    }

    BERAKHIR:
        printf("berakhir semua\n");


    return 0;
}
