#include <stdio.h>

int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int i = 0;
    while (i < sizeof(arr) / sizeof(arr[0])) {
        printf("%d ", arr[i]);
        i++;
    }
    return 0;
}