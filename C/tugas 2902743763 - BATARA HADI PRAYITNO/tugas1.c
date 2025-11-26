#include <stdio.h>
#define SIZE 3  /* lebih baik pakai #define daripada int global, 
                karena #define tidak bisa diubah-ubah nilainya di runtime 
                dan juga demi aku yang sudah di pelajari di modul harus di praktekan*/

/* Menggunakan definisi  agar lebih mudah dipahami dan bisa diubah di satu tempat saja,
tidak hanya itu saja, menggunakan definisi dapat membuat code menjadi lebih rapih dan terstruktur */
int pertambahan(int a, int b, int c) { return a + b + c; }
int pengurangan(int a, int b, int c) { return a - b - c; }
int perkalian(int a, int b, int c) { return a * b * c; }
float pembagian(int a, int b, int c) { //menggunakan float agar hasil pembagian tidak dibulatkan
    if (b == 0 || c == 0) {
        printf("Error: Tidak bisa membagi dengan nol!\n"); // mencegah pembagian dengan nilai nol
        return 0;
    } else {
        return (float)a / b / c;
    }
}
float rataRata(int a, int b, int c) { return (float)(a + b + c) / 3; } //begitujuga dengan ini

int main() { 
    int dataAngka[SIZE];
    int *pointer = dataAngka;
    char ulang;
    
    while (1) { // loop tak hingga, akan terus berulang sampai user memilih untuk berhenti
        printf("Masukkan 3 angka: ");
        for (int i = 0; i < SIZE; i++) {
            scanf("%d", &pointer[i]);
        }

        printf("penjumlahan = %d\n", pertambahan(dataAngka[0], dataAngka[1], dataAngka[2]));
        printf("pengurangan = %d\n", pengurangan(dataAngka[0], dataAngka[1], dataAngka[2]));
        printf("perkalian   = %d\n", perkalian(dataAngka[0], dataAngka[1], dataAngka[2]));
        printf("pembagian   = %.2f\n", pembagian(dataAngka[0], dataAngka[1], dataAngka[2]));
        printf("rata-rata   = %.2f\n", rataRata(dataAngka[0], dataAngka[1], dataAngka[2]));

        printf("Apakah ingin melakukan operasi lagi? (Y/n): "); // menanyakan user apakah ingin mengulang atau tidak
        scanf(" %c", &ulang);
        if (ulang == 'Y' || ulang == 'y') {
            continue;
        } else {
            break;
        }
    }
    return 0; 
}