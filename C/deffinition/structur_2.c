#include <stdio.h>
#include <string.h>

struct tmhs {
    char nim[11];
    char name[26];
    float gpa;
} akad, ali, tono;  // <-- ini variabel, bukan fungsi

int main() {
    // Mengisi data mahasiswa Ali
    sprintf(ali.nim, "1234567890");
    sprintf(ali.name, "Ali");
    ali.gpa = 3.85;

    // Menampilkan data
    printf("NIM: %s\n", ali.nim);
    printf("Nama: %s\n", ali.name);
    printf("IPK: %.2f\n", ali.gpa);

    // Mengisi data mahasiswa Tono
    sprintf(tono.nim, "9876543210");
    sprintf(tono.name, "Tono");
    tono.gpa = 3.75;

    // Menampilkan data
    printf("NIM: %s\n", tono.nim);
    printf("Nama: %s\n", tono.name);
    printf("IPK: %.2f\n", tono.gpa);

    return 0;
}
