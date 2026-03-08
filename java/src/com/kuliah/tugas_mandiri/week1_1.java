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
    }
}

public class week1_1 {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        mahasiswa mhs2 = new mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        mahasiswa mhs3 = new mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        mahasiswa mhs4 = new mahasiswa("Joni Suharto", "2440004", "Teknik Industri", 3.00);
        mahasiswa mhs5 = new mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();
        mhs4.tampilkanInfo();
        mhs5.tampilkanInfo();
    }
}