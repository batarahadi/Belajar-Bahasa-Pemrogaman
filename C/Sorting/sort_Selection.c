#include <stdio.h>
#include <stdlib.h>

void memilihSort(int bil[], int banyak){
    int posisi;
    for (int i = 0; i < banyak - 1; i++){
        posisi = i;  
        for (int j = i + 1; j < banyak; j++){
            if (bil[posisi] > bil[j]){
                posisi = j;
            }
        }
        if (i != posisi){
            int tmp = bil[i];
            bil[i] = bil[posisi];
            bil[posisi] = tmp;
        }
    }

    printf("Hasil setelah sorting:\n");
    for (int i = 0; i < banyak; i++){
        printf("%d ", bil[i]);
    }
    printf("\n");
}

int main() {
    int banyak, i, bil[10];

    do {
        printf("Masukkan banyak bilangan (max 10): ");
        scanf("%d", &banyak);
    } while (banyak < 1 || banyak > 10);

    for (i = 0; i < banyak; i++){
        printf("Masukkan bilangan ke-%d: ", i + 1);
        scanf("%d", &bil[i]);
    }

    memilihSort(bil, banyak);

    return 0;
}
