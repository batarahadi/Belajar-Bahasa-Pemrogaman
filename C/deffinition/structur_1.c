#include<stdio.h>

struct dataSiswa{
    char nama[20];
    int umur;
    float nilaiIPK;
};

int main() {
    struct dataSiswa siswa1;

    printf("Masukkan nama siswa: ");
    scanf("%[^\n]", siswa1.nama);

    printf("Masukkan umur siswa: ");
    scanf("%d", &siswa1.umur);
    
    printf("Masukkan nilai IPK siswa: ");
    scanf("%f", &siswa1.nilaiIPK);  

    printf("\n=== Data Siswa ===\n");    
    printf("Nama: %s\n", siswa1.nama);
    printf("Umur: %d\n", siswa1.umur);
    printf("Nilai IPK: %.2f\n", siswa1.nilaiIPK);
    return 0;
}