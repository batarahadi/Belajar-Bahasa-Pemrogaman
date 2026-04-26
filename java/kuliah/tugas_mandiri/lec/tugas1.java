package kuliah.tugas_mandiri.lec;
import java.util.Scanner;

class NodeBuku {
    String kodeBuku, judul, penulis;
    NodeBuku next;

    NodeBuku(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul    = judul;
        this.penulis  = penulis;
        this.next     = null;
    }
}

public class tugas1 {
    NodeBuku head;
    int jumlahBuku = 0;

    // ── TAMBAH BUKU (Push ke belakang) ──────────────────
    public void tambahBuku(String kodeBuku, String judul, String penulis) {

        // Validasi kode buku maksimal 5 karakter
        if (kodeBuku.length() > 5) {
            System.out.println("Kode buku maksimal 5 karakter!");
            return;
        }

        NodeBuku baru = new NodeBuku(kodeBuku, judul, penulis);

        if (head == null) {
            head = baru;
        } else {
            NodeBuku tampung = head;
            while (tampung.next != null) {
                tampung = tampung.next;
            }
            tampung.next = baru;
        }

        jumlahBuku++;
        System.out.println("Data berhasil ditambahkan!");
    }

    // ── HAPUS BUKU (Pop dari belakang) ──────────────────
    public void hapusBuku() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        // Hanya 1 node
        if (head.next == null) {
            System.out.println("Buku \"" + head.judul + "\" berhasil dihapus!");
            head = null;
            jumlahBuku--;
            return;
        }

        // Cari node sebelum terakhir
        NodeBuku tampung = head;
        while (tampung.next.next != null) {
            tampung = tampung.next;
        }

        System.out.println("Buku \"" + tampung.next.judul + "\" berhasil dihapus!");
        tampung.next = null;
        jumlahBuku--;
    }

    // ── CARI BUKU ────────────────────────────────────────
    public void cariBuku(String kodeBuku) {
        NodeBuku tampung = head;

        while (tampung != null) {
            if (tampung.kodeBuku.equalsIgnoreCase(kodeBuku)) {
                System.out.println("Buku ditemukan!");
                System.out.println("┌─────────────────────────────────");
                System.out.println("│ Kode   : " + tampung.kodeBuku);
                System.out.println("│ Judul  : " + tampung.judul);
                System.out.println("│ Penulis: " + tampung.penulis);
                System.out.println("└─────────────────────────────────");
                return;
            }
            tampung = tampung.next;
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // ── TAMPILKAN SEMUA BUKU ─────────────────────────────
    public void tampilkanSemua() {
        if (head == null) {
            System.out.println("Daftar buku kosong.");
            return;
        }

        System.out.println("\nDaftar Buku:");
        System.out.println("╔══════════╦══════════════════════════╦══════════════════════╗");
        System.out.printf( "║ %-8s ║ %-24s ║ %-20s ║%n", "Kode", "Judul", "Penulis");
        System.out.println("╠══════════╬══════════════════════════╬══════════════════════╣");

        NodeBuku tampung = head;
        while (tampung != null) {
            System.out.printf("║ %-8s ║ %-24s ║ %-20s ║%n",
                tampung.kodeBuku, tampung.judul, tampung.penulis);
            tampung = tampung.next;
        }

        System.out.println("╚══════════╩══════════════════════════╩══════════════════════╝");
        System.out.println("Total Buku: " + jumlahBuku);
    }

    // ── VALIDASI MINIMAL 5 BUKU ──────────────────────────
    public boolean cukupData() {
        if (jumlahBuku < 5) {
            System.out.println("Minimal 5 buku! Saat ini: " + jumlahBuku + " buku.");
            return false;
        }
        return true;
    }

    // ── MAIN ─────────────────────────────────────────────
    public static void main(String[] args) {
        tugas1 perpus = new tugas1();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Buku : ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Judul     : ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Penulis   : ");
                    String penulis = sc.nextLine();
                    perpus.tambahBuku(kode, judul, penulis);
                    break;

                case 2:
                    perpus.hapusBuku();
                    break;

                case 3:
                    System.out.print("Masukkan Kode Buku: ");
                    String cari = sc.nextLine();
                    perpus.cariBuku(cari);
                    break;

                case 4:
                    perpus.tampilkanSemua();
                    break;

                case 5:
                    // Validasi minimal 5 buku sebelum keluar
                    if (!perpus.cukupData()) break;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilihan != 5 || !perpus.cukupData());

        sc.close();
    }
}