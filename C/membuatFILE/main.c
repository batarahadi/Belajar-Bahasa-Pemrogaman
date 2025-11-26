#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *fp = fopen("data.bin", "a+");
    if (fp == NULL) {
        fprintf(stderr, "Gagal membuat file.\n");
        return 1;
    }

    char dataMasuk[100];
    printf("Masukkan data yang akan ditulis ke file (max 100 karakter): \n");
    fgets(dataMasuk, sizeof(dataMasuk), stdin);
    fputs(dataMasuk, fp);

    // fclose(fp);
    rewind(fp); // Kembali ke awal file untuk membaca


    // FILE *dataMembaca = fopen("contoh.txt", "r+");
    // if (dataMembaca == NULL) {
    //     printf("Error ! File tidak ditemukan.\n");
    //     exit(-1);
    // }
    
    
    char dataInputan[100];
    printf("Data yang ada dalam contoh.txt:\n");
    while (fgets(dataInputan, sizeof(dataInputan), fp) != NULL) {
        printf("%s", dataInputan);
    }
    
    // fclose(dataMembaca);
    fclose(fp);
    return 0;
}
