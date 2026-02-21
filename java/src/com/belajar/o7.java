//  Belajar Java [Dasar] - 07 - Memahami String[ ] args

/*  READ ME

Jalan kan perintah di terminal
1. javac ../src/com/belajar/o7.java -d ../bin
2. java com.belajar.o7 sayang 

*/

package com.belajar;

public class o7 {
    public static void main(String[] args) {
        System.out.println(args[0]); // <-- args adalah parameter yang bisa diisi ketika kita menjalankan program lewat terminal
        System.out.printf("Hello %s aku\n", args[0]); // <<-- jika memasukan kalimat "sayang" akan menjadi "Hello sayang aku"
    }
}
