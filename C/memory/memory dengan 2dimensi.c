#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int **arr; //ini adalah layer 2 dimensi pengganti int arr[5][5];
    int rows, columns;

    srand(time(0)); // Inisialisasi seed untuk pengacakan

    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    printf("Enter the number of columns: ");
    scanf("%d", &columns);

    // Alokasi memori untuk baris (pointer ke pointer int)
    arr = (int**)malloc(rows * sizeof(int*));
    if (arr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    // Alokasi memori untuk setiap kolom
    for (int i = 0; i < rows; i++) {
        arr[i] = (int*)malloc(columns * sizeof(int));
        if (arr[i] == NULL) {
            printf("Memory allocation failed!\n");
            return 1;
        }
    }

    // Mengisi array dengan nilai acak
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            arr[i][j] = rand() % 100; // Nilai acak antara 0 dan 99
        }
    }

    // Menampilkan isi array
    printf("Array elements:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    // Membebaskan memori
    for (int i = 0; i < rows; i++) {
        free(arr[i]);
    }
    free(arr);

    return 0;
}
