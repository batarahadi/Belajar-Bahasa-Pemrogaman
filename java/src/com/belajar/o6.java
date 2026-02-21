//  Belajar Java [Dasar] - 06 - Pengenalan Print Dan AlurEksekusi

/* READ ME


*/

package com.belajar;

public class o6 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, World!"); // tidak ada new line di belakang kalimat
        System.out.println("apa itu java"); // println untuk buat new line di belakang kalimat
        
        System.out.printf("ini nomor %d", 1);
        System.out.printf("ini nomor %d \n", 2); // \n untuk buat new line sama dengan pemrograman C
        System.out.printf("ini nomor %d \n", 3);
    }
}