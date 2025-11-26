#include <stdio.h>

void menemukan(int arr[], int key, int size) {
    for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                printf("Nilai %d ditemukan pada index ke-%d\n", key, i);
                break;
            } else {
                printf("Nilai %d tidak ditemukan\n", key);
            }
        }
}

int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int yangInginDitemukan = 22;
    int panjang = sizeof(arr) / sizeof(arr[0]);

    printf("Nilai yang ingin ditemukan: %d\n", yangInginDitemukan);
    menemukan(arr, yangInginDitemukan, panjang);
    
    return 0;
}