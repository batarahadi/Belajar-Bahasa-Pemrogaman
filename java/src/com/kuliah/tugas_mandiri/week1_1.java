package com.kuliah.tugas_mandiri;

class mahasiswa {
    String nama, nim, jurusan;
    double ipk;

    // constructor
    mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // menampilkan informasi mahasiswa
    void tampilkanInfo() {
        System.out.printf("Nama: %s\nNIM: %s\nJurusan: %s\nIPK: %.2f\n\n", nama, nim, jurusan, ipk);
    }}

public class week1_1 {
    public static void main(String[] args) {
        mahasiswa[] daftarMahasiswas = new mahasiswa[5];
        daftarMahasiswas[0] = new mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftarMahasiswas[1] = new mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftarMahasiswas[2] = new mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftarMahasiswas[3] = new mahasiswa("Joni Suharto", "2440004", "Teknik Industri", 3.00);
        daftarMahasiswas[4] = new mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        for (mahasiswa mhs : daftarMahasiswas) {
            mhs.tampilkanInfo();
        }
    }
}