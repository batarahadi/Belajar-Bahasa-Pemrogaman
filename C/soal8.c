#include <stdio.h>
#include <string.h>

struct dataMahasiswa{
    char NIM[6];
    char nama[20];
};

int main() {
    struct dataMahasiswa mhs[5];
    char cariNIM[6];
    int found = 0;
    
    // a. input data mahasiswa
    for(int i = 0; i < 5; i++) {
        printf("Masukkan NIM mahasiswa ke-%d: ", i + 1);
        scanf("%s", mhs[i].NIM);
        printf("Masukkan nama mahasiswa ke-%d: ", i + 1);
        scanf(" %[^\n]", mhs[i].nama);
    }
    
    // b. masukan NIM yang akan dicari
    printf("\nMasukkan NIM yang akan dicari: ");
    scanf("%s", cariNIM);
    
    // c. menemukan data mahasiswa berdasarkan NIM
    for(int i = 0; i < 5; i++) {
        if(strcmp(mhs[i].NIM, cariNIM) == 0) {
            printf("\nData mahasiswa ditemukan:\n");
            printf("NIM: %s\n", mhs[i].NIM);
            printf("Nama: %s\n", mhs[i].nama);
            found = 1;
            break;
        }
    }
    if (!found) {
        printf("\nData mahasiswa dengan NIM %s tidak ditemukan.\n", cariNIM);
    }
    return 0;
}
