#include<stdio.h>

int main(){
    char passwd[20];
    int tamp=0;
    const char pass[20] = "anakDurhaka001";

    while (1){
        printf("Masukan password anda: ");
        scanf("%s", passwd);
        if (strcmp(passwd, pass) ==0){
            printf("Password anda benar\n");
            break;
        } else {
            printf("Password anda salah\n");
            tamp++;
            if (tamp == 3){
                printf("Anda sudah 3x salah memasukan password, program akan keluar\n");
                break;
            }
        }
    }
}