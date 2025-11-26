#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr;
    int n;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    // Alokasi memori menggunakan calloc
    arr = (int*)calloc(n, sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    // Mengisi array
    for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
    }

    // Menampilkan isi array
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Mengubah ukuran array
    printf("Enter the new number of elements: ");
    scanf("%d", &n);

    arr = (int*)realloc(arr, n * sizeof(int));
    if (arr == NULL) {
        printf("Memory reallocation failed!\n");
        return 1;
    }

    // Menampilkan isi array setelah realokasi
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Membebaskan memori
    free(arr);
    
    return 0;
}