/*
2902743763 - BATARA HADI PRAYITNO
2902742861 - DIRK EIBEL LAMBANG
2902692844 - JERI IRAWAN
2902703293 - JOSUA EMANUELLE ARSETO
2602211871 - MATIAS NDAWA ATA BARA
*/
package kuliah.tugas_kelompok.t2;
import java.util.Scanner;

// Menggunakan kembali class Lagu dengan atribut judul, artis, dan durasi
class Lagu {
    String judul;
    String artis;
    double durasi;

    // Constructor
    Lagu(String judul, String artis, double durasi) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    // Method untuk menampilkan informasi lagu
    public void tampilkanInfo() {
        System.out.println("Judul   : " + judul);
        System.out.println("Artis   : " + artis);
        System.out.println("Durasi  : " + durasi + " Menit");
        System.out.println("-------------------------");
    }
}

public class PlaylistArray {
    
    // 1. TRAVERSAL: Menampilkan daftar lagu
    private static void tampilkanSemuaLagu(Lagu[] playlist) {
        System.out.println("\nDaftar lagu saat ini:");
        boolean isEmpty = true;
        int nomor = 1;

        // Menelusuri seluruh array untuk menampilkan data
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                System.out.printf("%d. %s - %s (%.2f menit)\n", 
                    nomor++, playlist[i].judul, playlist[i].artis, playlist[i].durasi);
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("Playlist masih kosong.");
        }
    }

    // 2. INSERTION: Menambahkan lagu baru ke dalam playlist
    private static void tambahLagu(Lagu[] playlist, Scanner consoleInput) {
        // Memeriksa apakah playlist sudah penuh [cite: 336]
        int indexKosong = -1;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] == null) {
                indexKosong = i;
                break;
            }
        }

        if (indexKosong == -1) {
            System.out.println("Maaf, Playlist Penuh! Tidak dapat menambahkan lagu baru.");
            return;
        }

        System.out.print("Masukkan judul lagu : ");
        String judul = consoleInput.nextLine();
        System.out.print("Masukkan artis      : ");
        String artis = consoleInput.nextLine();
        System.out.print("Masukkan durasi (menit): ");
        double durasi = Double.parseDouble(consoleInput.nextLine()); 

        // Memasukkan data ke indeks yang kosong
        playlist[indexKosong] = new Lagu(judul, artis, durasi);
        System.out.println("Lagu berhasil ditambahkan!");
        
        tampilkanSemuaLagu(playlist);
    }

    // 3. DELETION: Menghapus lagu dari playlist berdasarkan judul
    private static void hapusLagu(Lagu[] playlist, Scanner consoleInput) {
        System.out.print("Masukkan judul lagu yang ingin dihapus: ");
        String judul = consoleInput.nextLine();
        boolean isDeleted = false;

        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null && playlist[i].judul.equalsIgnoreCase(judul)) {
                // Menggeser elemen array agar data tetap rapat setelah penghapusan 
                for (int j = i; j < playlist.length - 1; j++) {
                    playlist[j] = playlist[j + 1];
                }
                // Mengosongkan elemen terakhir
                playlist[playlist.length - 1] = null;
                isDeleted = true;
                System.out.println("Lagu '" + judul + "' berhasil dihapus.");
                break;
            }
        }

        if (!isDeleted) {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    // 4. SEARCHING: Mencari lagu berdasarkan judul
    private static void cariLagu(Lagu[] playlist, Scanner consoleInput) {
        System.out.print("Masukkan judul lagu yang dicari: ");
        String judulDicari = consoleInput.nextLine();
        boolean isExist = false;

        System.out.println("\nHasil Pencarian:");
        // Menggunakan metode linear search 
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null && playlist[i].judul.toLowerCase().contains(judulDicari.toLowerCase())) {
                playlist[i].tampilkanInfo();
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("Lagu tidak ditemukan dalam playlist.");
        }
    }

    // 5. SORTING: Mengurutkan lagu berdasarkan durasi (ascending) menggunakan Bubble Sort 
    private static void urutkanLaguBerdasarkanDurasi(Lagu[] playlist) {
        int n = 0;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                n++;
            }
        }

        if (n == 0) {
            System.out.println("Playlist masih kosong, tidak ada yang bisa diurutkan.");
            return;
        }

        System.out.println("\n=== Sebelum Pengurutan ===");
        tampilkanSemuaLagu(playlist); // Menampilkan hasil sebelum pengurutan 

        // Algoritma Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (playlist[j].durasi > playlist[j + 1].durasi) {
                    Lagu temp = playlist[j];
                    playlist[j] = playlist[j + 1];
                    playlist[j + 1] = temp;
                }
            }
        }

        System.out.println("\n=== Sesudah Pengurutan (Ascending) ===");
        tampilkanSemuaLagu(playlist); // Menampilkan hasil sesudah pengurutan 
    }
    public static void main(String[] args) {
        // Deklarasi array statis dengan kapasitas maksimum 10 lagu
        Lagu[] playlist = new Lagu[10];
        Scanner consoleInput = new Scanner(System.in);
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            // Menu interaktif sesuai expected output dengan opsi tambahan untuk sorting
            System.out.println("\n=== MENU PLAYLIST MUSIK ===");
            System.out.println("1. Tampilkan semua lagu");
            System.out.println("2. Tambah lagu baru");
            System.out.println("3. Hapus lagu berdasarkan judul");
            System.out.println("4. Cari lagu berdasarkan judul");
            System.out.println("5. Urutkan berdasarkan durasi");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            String userInput = consoleInput.nextLine();

            switch (userInput) {
                case "1":
                    tampilkanSemuaLagu(playlist);
                    break;
                case "2":
                    tambahLagu(playlist, consoleInput);
                    break;
                case "3":
                    hapusLagu(playlist, consoleInput);
                    break;
                case "4":
                    cariLagu(playlist, consoleInput);
                    break;
                case "5":
                    urutkanLaguBerdasarkanDurasi(playlist);
                    break;
                case "6":
                    isLanjutkan = false;
                    System.out.println("Terima kasih telah menggunakan program Playlist Musik!");
                    break;
                default:
                    System.err.println("Pilihan tidak valid. Silakan pilih menu 1-6.");
            }
        }
        consoleInput.close();
    }

}