#include <stdio.h>

int main() {
    FILE *fp;
    unsigned char buffer[100];  // buffer 8 byte

    fp = fopen("data.bin", "r");
    if (fp == NULL) {
        printf("Gagal membuka file!\n");
        return 1;
    }

    fread(buffer, 1, sizeof(buffer), fp); // baca 8 byte dari file

    for (int i = 0; i < sizeof(buffer); i++) {
        printf("%02X ", buffer[i]); // tampilkan dalam format heksadesimal
    }

    fclose(fp);
    return 0;
}