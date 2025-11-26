#include <stdio.h>
#include <string.h>

/*Penjelasan:

Saat id diisi 10 → nilai benar.
Setelah nama diisi "Hans" → data id akan tertimpa (karena pakai memori yang sama).
Setelah nilai diisi 90.5 → data nama juga ikut rusak.
maka dari itu struktur di atas jangan di samakan dengan STRUCT()
*/

union Data {
    int id;
    char nama[20];
    float nilai;
};

int main() {
    union Data data;
    
    data.id = 10;
    printf("Nama: %s\n", data.nama);

    strcpy(data.nama, "Hans");
    printf("ID: %d\n", data.id);
    
    data.nilai = 90.5;
    printf("Nilai: %.2f\n", data.nilai);
    
    return 0;
}
