#include <stdio.h>

void sort(int arr[], int size) {
    for (int i = 0; i < size; i++){
        for (int j = i ; j < size-i-1 ; j++){
            if (arr[j] > arr[j+1]){
                int tampung = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tampung;
            }
        }
    }
}

int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int key = 22;
    int panjang = sizeof(arr) / sizeof(arr[0]);

    sort(arr, panjang);

    printf("Sorted array: ");
    for (int i = 0; i < panjang; i++) {
        printf("%d ", arr[i]);
    }
    
    return 0;
}