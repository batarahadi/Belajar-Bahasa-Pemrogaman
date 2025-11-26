#include <stdio.h>
#include <stdlib.h> // harus ada stdlib.h untuk calloc dan free

int main() {
    int n = 1;


    int *nilai = calloc(n, sizeof(int)); /* 
    n adalah jumlah array. jika tidak diisi array maka akan error, 
    maka dari itu lebih baik diisi meskipun nilainya 0
    berbeda dengan malloc yang tidak perlu array 
    */

    printf("nilai : %d\n", *nilai); // harus ada *
    printf("Alamat memori nilai: %p\n", nilai); // menampilkan alamat memori, tidak perlu tanda *
    printf("Isi array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", nilai[i]); // jika memanggil menggunakan array tidak perlu tanda *
    }

    free(nilai); // wajib free setelah selesai

    return 0;
}