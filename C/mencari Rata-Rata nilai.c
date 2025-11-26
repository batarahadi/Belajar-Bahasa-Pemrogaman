#include <stdio.h>

int main() {
    int jumlahAngka,i;
    float sum = 0, ratarata;

    printf("Masukkan jumlah bilangan: ");
    scanf("%d", &jumlahAngka);
    int arr[jumlahAngka];
    
    printf("Masukkan %d bilangan:\n", jumlahAngka);
    for(i = 0; i < jumlahAngka; i++) {
        scanf("%d", &arr[i]);
    }

    int *ptr = arr;
    for ( i = 0; i < jumlahAngka; i++) {
        sum += *(ptr + i);
    }

    ratarata = sum / jumlahAngka;
    printf("Rata-rata: %.2f\n", ratarata);
    
    return 0;
}