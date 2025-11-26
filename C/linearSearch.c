#include <stdio.h>

int linear_search(int arr[], int n, int key) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == key)
            return i;
    }
    return -1;  // tidak ditemukan
}

int main() {
    int arr[] = {10, 23, 5, 46, 17};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key = 41;
    int idx = linear_search(arr, n, key);
    if (idx != -1)
        printf("Elemen %d ditemukan di indeks %d\n", key, idx);
    else
        printf("Elemen %d tidak ditemukan\n", key);
    return 0;
}
