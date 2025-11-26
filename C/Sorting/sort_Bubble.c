#include <stdio.h>

#define MAX_SIZE 10

// Definisi fungsi bubble sort
void bubbleSort(int arr[], int n) {
    int i, j;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];  // Tukar arr[j] dan arr[j+1]
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void printlist(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d \n", arr[i]);
    }
}

int main() {
    int arr[5] = {5, 3, 4, 1, 2};
    int n = sizeof(arr) / sizeof(arr[0]);

    bubbleSort(arr, n); // Pemanggilan fungsi

    printf("Hasil pengurutan: \n");
    for (int i = 0; i < n; i++) {
        printf("%d \n", arr[i]);
    }



/* DENGAN RANDOM ANGKA*/


    int list[MAX_SIZE];
    int i = 0;

    // generate random numbers
    for(i = 0; i < MAX_SIZE; i++) {
        list[i] = rand()%100; //<< Menambahkan random angka dari 0-99 dan harus menggunakan #include <stdlib.h>
    }

    printf("the list befor sorting is :\n");
    printlist(list, MAX_SIZE);

    // sort the list
    bubbleSort(list, MAX_SIZE);

    // print the sorted list
    printf("the list after sorting is :\n");
    printlist(list, MAX_SIZE);
    return 0;
}
