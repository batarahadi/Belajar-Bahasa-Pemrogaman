#include <stdio.h>

/*
Apa itu typedef?

typedef = memberi nama alias untuk tipe data yang sudah ada.
Jadi bukan bikin tipe baru, hanya bikin nama lain yang lebih enak dipakai.
*/

// typedef untuk tipe dasar
typedef int Integer;
typedef float Real;
typedef char Character;

int main() {
    Integer umur = 25;      // sama dengan: int umur = 25;
    Real tinggi = 170.5f;   // sama dengan: float tinggi = 170.5;
    Character huruf = 'A';  // sama dengan: char huruf = 'A';

    printf("Umur: %d\n", umur);
    printf("Tinggi: %.1f\n", tinggi);
    printf("Huruf: %c\n", huruf);

    return 0;
}
