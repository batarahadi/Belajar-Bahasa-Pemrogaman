#include <stdio.h>

int main() {
    FILE *fpIn, *fpGenap, *fpGanjil;
    int angka;

    fpIn = fopen("angka.txt", "r");
    if (fpIn == NULL) {
        printf("Gagal membuka file angka.txt\n");
        return 1;
    }

    fpGenap = fopen("genap.txt", "w");
    fpGanjil = fopen("ganjil.txt", "w");
    if (fpGenap == NULL || fpGanjil == NULL) {
        printf("Gagal membuat file output.\n");
        return 1;
    }

    while (fscanf(fpIn, "%d", &angka) != EOF) {
        if (angka % 2 == 0)
            fprintf(fpGenap, "%d ", angka);
        else
            fprintf(fpGanjil, "%d ", angka);
    }

    printf("Proses selesai! Lihat hasil di genap.txt dan ganjil.txt\n");

    fclose(fpIn);
    fclose(fpGenap);
    fclose(fpGanjil);

    return 0;
}
