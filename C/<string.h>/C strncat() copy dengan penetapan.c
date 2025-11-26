#include <stdio.h>
#include <string.h>

int main () {
    // CONTOH 1
   char src[50], dest[50];

   strcpy(src,  "This is source");
   strcpy(dest, "This is destination");
   strncat(dest, src, 15);

   printf("Final destination string : |%s|", dest);


    // CONTOH 2
   char dest[20] = "Hello, ";
   char src[] = "Beautiful World!";

   // Append "World"
   strncat(dest, src + 10, 5); 

   printf("Concatenated substring: %s\n", dest);

   return(0);
}