#include <stdio.h>
#include <string.h>


int main () {
    // CONTOH 1
    char src[40];
    char dest[12];
  
    memset(dest, '\0', sizeof(dest));
    strcpy(src, "This is tutorialspoint.com");
    strncpy(dest, src, 10);
   
    printf("Final copied string : %s\n", dest);
   

   
    // CONTOH 2
    char source[] = "Hello, Note!";
    // Fixed length
    char destination[10]; 
      
    // Copy "Note!"
    strncpy(destination, source + 7, 4); 
    printf("Copied substring: %s\n", destination);

   return(0);
}


