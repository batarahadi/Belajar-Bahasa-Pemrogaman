package com.kuliah;
import java.util.ArrayList;

public class kul02_arraylist {
    public static void main(String[] args){
        ArrayList<Integer> listAngka = new ArrayList<>();

        // Menambahkan elemen ke dalam ArrayList
        listAngka.add(1);
        listAngka.add(6);

        System.out.println("Array angka:");
        System.out.println(listAngka);  // Menampilkan seluruh elemen dalam Array
        System.out.println(listAngka.get(0));   // Mengakses elemen pertama (indeks 0)
    }
}