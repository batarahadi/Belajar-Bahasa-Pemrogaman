// Belajar Fungsi Tanda Tanya (Conditional Operator)
// Tanda tanya (?) adalah operator kondisional yang digunakan untuk mengevaluasi sebuah kondisi
// Jika kondisi benar (true), maka nilai pertama akan dikembalikan, jika salah (false), maka nilai kedua yang akan dikembalikan


#include <stdio.h>

int main() {
    int x = 7;
    printf("%d adalah %s\n", x, (x % 2 == 0) ? "genap" : "ganjil");
    return 0;
}
