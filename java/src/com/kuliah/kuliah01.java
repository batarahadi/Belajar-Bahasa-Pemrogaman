package com.kuliah;

class dataMahasiswa {
    String nama;
    int umur;

    // constructor
    dataMahasiswa(String nama,int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // method/fungsi
    void tampilkanInfo() {
        System.out.printf("Nama: %s\nUmur: %d\n", nama, umur);
    }
}

public class kuliah01 {
    public static void main(String[] args) {
        dataMahasiswa mhs1 = new dataMahasiswa("Adi", 19);
        dataMahasiswa mhs2 = new dataMahasiswa("Budi",20);
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}