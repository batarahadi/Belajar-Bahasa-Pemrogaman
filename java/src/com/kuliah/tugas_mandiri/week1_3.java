package com.kuliah.tugas_mandiri;
import java.util.Scanner;

class mahasiswa {
    String nama, nim, jurusan;
    private double ipk; 

    // constructor
    mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;}

    public double getIpk() {
        return ipk;}

    public void setIpk(double ipk) {
        this.ipk = ipk;}

    public String cekLulus() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
}}
    
    // Tambahan baru
    public String hitungPredikat() {
        if (ipk >= 3.75) return "Dengan Pujian";
        else if (ipk >= 3.50) return "Sangat Memuaskan";
        else if (ipk >= 3.00) return "Memuaskan";
        else return "Perlu Perbaikan";}

    void tampilkanInfo() {
        System.out.printf("Nama: %s\nNIM: %s\nJurusan: %s\nIPK: %.2f\nStatus: %s\nPredikat: %s\n\n",
                nama, nim, jurusan, ipk, cekLulus(), hitungPredikat()); // update di sini
    }}

public class week1_3 {
    public static void main(String[] args) {
        mahasiswa[] daftarMahasiswas = new mahasiswa[5];
        daftarMahasiswas[0] = new mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftarMahasiswas[1] = new mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftarMahasiswas[2] = new mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftarMahasiswas[3] = new mahasiswa("Joni Suharto", "2440004", "Teknik Industri", 3.00);
        daftarMahasiswas[4] = new mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("Daftar Mahasiswa:"); // menampilkan data awal
        for (mahasiswa mhs : daftarMahasiswas) {
            mhs.tampilkanInfo();
        }

        Scanner dataInputScanner = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate IPK-nya: ");
        String nimUtkUpdate = dataInputScanner.nextLine();

        boolean ketemu = false;
        for (mahasiswa mhs : daftarMahasiswas) {
            if (mhs.nim.equals(nimUtkUpdate)) {
                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = dataInputScanner.nextDouble();
                mhs.setIpk(ipkBaru);
                System.out.println("Data mahasiswa dengan NIM " + nimUtkUpdate + " berhasil diupdate.");

                System.out.println("=== Data Mahasiswa ===");
                mhs.tampilkanInfo();
                ketemu = true;
                break;}}

        if (!ketemu) {
            System.out.println("Mahasiswa dengan NIM " + nimUtkUpdate + " tidak ditemukan.");}
        dataInputScanner.close();
    }
}