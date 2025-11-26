// Belajar Fungsi Switch Case
// Switch case digunakan untuk mengecek nilai dari sebuah variabel
// Mirip dengan if else, tapi lebih ringkas
// Biasanya digunakan untuk mengecek nilai yang pasti, misal char atau int


#include <stdio.h>

int main() {
    char huruf = 'a';

    switch (huruf) { // jika di python pake match case
    case ('a'): // bisa pake tanda kurung atau tidak pakai tanda kurung
        break;
    case 'b':
        printf("hallo\n");
        break;
    default:
        break;
    }
    
    return 0;
}