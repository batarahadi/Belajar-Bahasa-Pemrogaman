#include <stdio.h>

void masukanPesan() {
    FILE *file = fopen("pesan.txt", "a");
    if (file == NULL) {
        printf("Gagal membuka file.\n");
        return;
    }
    char pesan[256];
    printf("Masukkan pesan yang akan disimpan max 250 karakter: ");
    fgets(pesan, sizeof(pesan), stdin);
    fprintf(file, "%s", pesan);

    fclose(file);
}

int main() {
    masukanPesan();
    return 0;
}
