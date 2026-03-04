package com.kuliah;

class Mahasiswa {
    String nama;
    int umur;

    Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanInfo() {
        System.out.printf("Nama: %s\nUmur: %d\n", nama, umur);
    }
}

public class kuliah01 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Adi", 19);
        mhs1.tampilkanInfo();
    }
}
