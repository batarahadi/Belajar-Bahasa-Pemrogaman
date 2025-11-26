#include<stdio.h>

void insertion(int bil[], int banyak) {
    int i,j,tamp;
    for(i=1; i<banyak; i++) {
        tamp = bil[i];
        for(j=i-1; j>=0 && bil[j]>tamp; j--) {
            bil[j+1] = bil[j];
        }
        bil[j+1] = tamp;
    }
    printf("\nHasil setelah sorting:\n");
    for(i=0; i<banyak; i++) {
        printf("%d ", bil[i]);
    }
    printf("\n");
}

int main() {
    int banyak, i,bil[10];

    do {
        printf("Masukan banyak bilangan (1-10): ");
        scanf("%d", &banyak);
    } while (banyak<1 || banyak>10);

    for(i=0; i<banyak; i++) {
        printf("Masukan bilangan ke-%d: ", i+1);
        scanf("%d", &bil[i]);
    }
    
    insertion(bil, banyak);
    
    return 0;
}