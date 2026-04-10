class iniNode {
    int isiData; 
    iniNode nextAja; 

    public iniNode(int a) {
        this.isiData = a;
        this.nextAja = null;
    }
}

public class utama {
    // Fungsi otomatis buat nambahin data di paling belakang
    public static void tambahDiUjung(iniNode kepala, int angkaBaru) {
        iniNode kotakBaru = new iniNode(angkaBaru);
        iniNode kurir = kepala; // Kurir mulai dari awal [cite: 279]

        // --- ALUR JALANNYA KURIR ---
        // Selama kotak di belakangnya MASIH ADA, kurir harus maju terus 
        while (kurir.nextAja != null) {
            kurir = kurir.nextAja; // Langkah maju [cite: 282]
        }

        // Kalau sudah sampai di kotak yang belakangnya KOSONG, baru sambungin! [cite: 286]
        kurir.nextAja = kotakBaru;
    }

    public static void main(String[] args) {
        iniNode kepala = new iniNode(10); // Data 1

        // Kita tambah datanya satu per satu
        tambahDiUjung(kepala, 20); // Data 2
        tambahDiUjung(kepala, 30); // Data 3
        tambahDiUjung(kepala, 40); // Data 4

        // Tampilkan hasilnya
        iniNode penampil = kepala;
        System.out.print("Urutan Rantai: ");
        while (penampil != null) {
            System.out.print(penampil.isiData + " -> ");
            penampil = penampil.nextAja;
        }
        System.out.println("null");
    }
}