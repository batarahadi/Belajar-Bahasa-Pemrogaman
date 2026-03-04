package com.kuliah;

public class kuliah02 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};

        // Traversal
        System.out.println("Array angka:");
        for (int i : angka) {
            System.out.println(i);
        }

        // Pencarian
        int target = 3;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == target) {
                System.out.printf("Angka %d ditemukan pada indeks %d\n", target, i);
            }
        }

        // Menambahkan elemen baru kedalam array
        int[] angkaBaru = new int[angka.length + 1];
        System.arraycopy(angka, 0, angkaBaru, 0, angka.length);
        angkaBaru[angkaBaru.length - 1] = 6;

        System.out.println("Array setelah penambahan elemen baru:");
        for (int i : angkaBaru) {
            System.out.println(i);
        }
    }
}