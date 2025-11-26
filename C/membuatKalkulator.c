#include <stdio.h>

int pertambahan(int a, int b) {return a + b;}
int pengurangan(int a, int b) {return a - b;}
int perkalian(int a, int b) {return a * b;}
float pembagian(int a, int b) {return (float)a / b;}

int main() {
    int data[2];
    int *pointer = data;
    int angka1, angka2;

    char simbol;
    char ulang;

    while (1) {
        printf("Masukkan simbol (+, -, x, :) untuk melakukan Operator Aritmatika atau 'q' untuk keluar: ");
        scanf(" %c", &simbol);
        if (simbol == '+' || simbol == '-' || simbol == 'x' || simbol == ':') {
            printf("Masukkan angka pertama: ");
            scanf("%d", &angka1);
            printf("Masukkan angka kedua: ");
            scanf("%d", &angka2);
            *(pointer + 0) = angka1;
            *(pointer + 1) = angka2;
    
            printf("angka pertama = %d\n", data[0]);
            printf("angka kedua = %d\n", data[1]);
    
            switch (simbol){
                case '+': {
                    int hasil = pertambahan(data[0], data[1]);
                    printf("Hasil penjumlahan %d + %d = %d\n", data[0], data[1], hasil);
                    break;}
                case '-': {
                    int hasil = pengurangan(angka1, angka2);
                    printf("Hasil pengurangan %d - %d = %d\n", data[0], data[1], hasil);
                    break;}
                case 'x': {
                    int hasil = perkalian(angka1, angka2);
                    printf("Hasil perkalian %d x %d = %d\n", data[0], data[1], hasil);
                    break;}
                case ':': {
                    float hasil = pembagian(angka1, angka2);
                    printf("Hasil pembagian %d : %d = %.2f\n", data[0], data[1], hasil);
                    break;}
                default:
                    break;
            }
        }
        else if (simbol == 'q' || simbol == 'Q') {
            printf("Keluar dari program.\n");
            break;
        }
        else {
            printf("Simbol yang anda masukkan salah, program sudah keluar.\n");
            break;
        }
        printf("Apakah ingin melakukan operasi lagi? (Y/n): \n");
        scanf(" %c", &ulang);
        if (ulang == 'Y' || ulang == 'y') {
            continue;
        }
        else {
            break;
        }
    }
    return 0;}