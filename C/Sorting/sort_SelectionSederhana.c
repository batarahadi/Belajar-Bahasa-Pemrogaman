#include<stdio.h>

void selectSort(int arr[], int panjang){
    int i,j,tampung;
    for(i=0; i<panjang-1; i++){
        tampung = i;
        for(j=i+1; j<panjang; j++){
            if(arr[tampung]>arr[j]){
                tampung = j;
            }
        }
        if (i != tampung){
            int tmp = arr[i];
            arr[i] = arr[tampung];
            arr[tampung] = tmp;
        }
    }
}

int main(){
    int arr[] = {64, 25, 12, 22, 11};
    int berapaPanjang = sizeof(arr)/sizeof(arr[0]);

    selectSort(arr, berapaPanjang);
    return 0;
}