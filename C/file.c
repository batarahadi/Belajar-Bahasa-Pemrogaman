#include <stdio.h>

int main() {
    FILE *fin, *fgenap, *fganjil;
    int angka;

    // Buka file input
    fin = fopen("angka.txt", "r");
    if (fin == NULL) {
        printf("Gagal membuka file angka.txt\n");
        return 1;
    }

    // Buka file output untuk menulis hasil
    fgenap = fopen("genap.txt", "w");
    fganjil = fopen("ganjil.txt", "w");

    if (fgenap == NULL || fganjil == NULL) {
        printf("Gagal membuat file output.\n");
        fclose(fin);
        return 1;
    }

    // Baca semua bilangan dari file
    while (fscanf(fin, "%d", &angka) == 1) {
        if (angka % 2 == 0) {
            fprintf(fgenap, "%d ", angka);  // tulis ke genap.txt
        } else {
            fprintf(fganjil, "%d ", angka); // tulis ke ganjil.txt
        }
    }

    // Tutup semua file
    fclose(fin);
    fclose(fgenap);
    fclose(fganjil);

    printf("Pemrosesan selesai!\n");
    printf("Bilangan genap disimpan di genap.txt\n");
    printf("Bilangan ganjil disimpan di ganjil.txt\n");

    return 0;
}
