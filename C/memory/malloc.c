#include <stdio.h>
#include <stdlib.h> // harus ada stdlib.h untuk malloc dan free

int main() {
    int n = 1;

    int *nilai = malloc(sizeof(int)); /*
    bisa juga diisi malloc(n * sizeof(int));
    nilai n adalah array 
    malloc tidak perlu array seperti calloc
    */

    printf("Alamat memori nilai: %d\n", *nilai); // harus ada *
    printf("Alamat memori nilai: %p\n", nilai); // menampilkan alamat memori, tidak perlu tanda *
    printf("Isi array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", nilai[i]); // jika memanggil menggunakan array tidak perlu tanda *
    }

    free(nilai); // wajib free setelah selesai

    return 0;
}
