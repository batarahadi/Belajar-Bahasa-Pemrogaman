/*   elajar Java [Dasar] - 08 - 


READ ME

Jalan kan perintah di terminal
1. javac ../src/com/belajar/o8.java -d ../bin
2. java com.belajar.o8

*/


package com.belajar;

public class o8 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args ke %d adalah %s\n", i, args[i]);
        }
    }
}
