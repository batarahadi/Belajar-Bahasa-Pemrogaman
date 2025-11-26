#include<stdio.h>
#define UKURAN 5 // mendefinisikan ukuran array biar gak mudah berubah-ubah

/* Saya selalu menambahkan defini agar lebih mudah dimengerti dan code menjadi bersih dan enak dilihat
dan menggunakan for loop biar gak nulis satu satu seperti di dalam video LMS di tab Lab minggu ke 5*/
int nilaiTertinggi(int arrey[], int jumlahloop) {
    int tertinggi = arrey[0]; 
    for (int i = 1; i < jumlahloop; i++) {
        if (arrey[i] > tertinggi) {
            tertinggi = arrey[i];
        }
    }
    return tertinggi;
}

int nilaiTerrendah(int arrey[], int jumlahloop) { 
    int terrendah = arrey[0];
    for (int i = 1; i < jumlahloop; i++) {
        if (arrey[i] < terrendah) {
            terrendah = arrey[i];
        }
    }
    return terrendah;
}


float jumlahRata2(int arrey[], int jumlahloop) {
    int total = 0;
    for (int i = 0; i < jumlahloop; i++) {
        total += arrey[i];
    }
    return (float)total / jumlahloop;}

int main(){
    char ulang;

    while(1){
        int dataNilai[UKURAN]={0}; // inisialisasi array dengan nilai kosong agar mudah terkontrol dan tidak menghasilkan nilai acak
        int *pointer = dataNilai;

        printf("Masukan 5 nilai Siswa : \n");
        for (int i = 0; i < UKURAN; i++){
            printf("Nilai ke-%d : ", i+1);
            scanf("%d", &pointer[i]);
        }

        for (int i = 0; i < UKURAN; i++){ // menggunakan for loop biar gak nulis ulang ulang
            printf("Nilai ke-%d : %d\n", i+1, *(pointer + i));
        }
        printf("Nilai ujian tertinggi siswa ini adalah : %d\n", nilaiTertinggi(dataNilai, UKURAN));
        printf("Nilai ujian terrendah siswa ini adalah : %d\n", nilaiTerrendah(dataNilai, UKURAN));
        printf("Rata-rata nilai siswa ini adalah       : %.2f\n", jumlahRata2(dataNilai, UKURAN));

        printf("Apakah ingin memasukan nilai ujian siswa lagi? (Y/n) : "); // menanyakan user apakah ingin mengulang atau tidak
        scanf(" %c", &ulang);
        if (ulang == 'Y' || ulang == 'y'){
            continue;
        } else if (ulang == 'N' || ulang == 'n') {
            break;
        } else {
            printf("Input yang anda masukan salah, dan program ini berhenti\n");
            break;
        }
    }
    return 0;
}