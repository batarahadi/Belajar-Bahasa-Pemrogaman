#include <stdio.h>

int main() {
    printf("%-4s %-12s %s\n", "No", "Nama", "Harga"); // Header tabel
    printf("%-4d %-12s %d\n", 1, "Pensil", 2000);
    printf("%-4d %-12s %d\n", 2, "Buku Tulis", 5000);

    return 0;
}