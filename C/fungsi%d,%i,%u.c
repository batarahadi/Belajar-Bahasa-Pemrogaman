#include <stdio.h>

// Belajar format specifier %d, %i, dan %u
// %d = integer (desimal, basis 10), bisa menampilkan angka positif dan negatif
// %i = integer (desimal, basis 10), bisa menampilkan angka positif dan negatif
// %u = unsigned integer (desimal, basis 10), hanya bisa menampilkan angka positif

int main() {
    int angkaPositif = 5;
    int angkaNegatif = -6;
    unsigned int angka = 12;

    // print menggunakan format specifier %d
    printf("angka positif dengan %%d: %d\n", angkaPositif);
    printf("angka negatif dengan %%d: %d\n", angkaNegatif);

    // print menggunakan format specifier %i
    printf("angka positif dengan %%i: %i\n", angkaPositif);
    printf("angka negatif dengan %%i: %i\n", angkaNegatif);

    // print menggunakan format specifier %u
    printf("angka positif dengan %%u: %u\n", angkaPositif);
    printf("angka negatif dengan %%u: %u\n", angkaNegatif);
    printf("angka dengan %%u: %u\n", angka);

    return 0;
}
