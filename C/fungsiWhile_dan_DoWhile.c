#include<stdio.h>

int main() {
    int i = 10;

    // while 1
    while(i <= 5) {
        printf("While: %d\n", i);
        i++;
    }
    

    // while 2
    int c;

    printf("Enter a character:\n(enter x to exit)\n");
    while (c != 'x') {
        c = getc(stdin);

        putchar(c);
    }
    printf("\nOut of the for loop. Bye!\n");


    // do…while
    i = 10;
    do {
        printf("Do…while: %d\n", i);
        i++;
    } while(i <= 5);

    return 0;
}