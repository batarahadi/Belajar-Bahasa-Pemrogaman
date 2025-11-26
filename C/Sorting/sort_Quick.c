#include<stdio.h>

void quickSort(int *bil[], int kr, int kn){
    int i,j,k;
    if(kr < kn){
        j=kr;
        k=kn+1;
        do{
            do J++; while((j<=kn) && (*bil[j] < *bil[kr]));
            do K--; while((*bil[k] > *bil[kr]));
            if(j<k){
                int temp = *bil[j];
                *bil[j] = *bil[k];
                *bil[k] = temp;
            }
            
        }
    }
}