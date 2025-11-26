#include <stdio.h>
#include <stdlib.h> // perlu untuk system()

/* untuk membersihkan terminal/console secara otomatis
system("cls") = clear screen di Windows.
system("clear") = clear screen di Linux/Mac.*/


int main() {
    printf("Halo Hans!\n");
    system("clear");   // layar console dibersihkan
    printf("Layar sudah dibersihkan!\n");
    return 0;
}
