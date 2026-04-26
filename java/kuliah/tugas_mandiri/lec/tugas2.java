package kuliah.tugas_mandiri.lec;
import java.util.Scanner;

// ── NODE PELANGGAN ───────────────────────────────────────
class NodePelanggan {
    String nomorAntrian, namaPelanggan;
    double totalBelanja;
    NodePelanggan next;

    NodePelanggan(String nomorAntrian, String namaPelanggan, double totalBelanja) {
        this.nomorAntrian  = nomorAntrian;
        this.namaPelanggan = namaPelanggan;
        this.totalBelanja  = totalBelanja;
        this.next          = null;
    }
}

// ── QUEUE (Antrian Pelanggan) ────────────────────────────
class QueuePelanggan {
    NodePelanggan depan, belakang;
    int jumlah = 0;

    public void enqueue(String nomor, String nama, double belanja) {
        NodePelanggan baru = new NodePelanggan(nomor, nama, belanja);
        if (belakang != null) belakang.next = baru;
        belakang = baru;
        if (depan == null) depan = baru;
        jumlah++;
        System.out.println("✅ Data pelanggan ditambahkan ke antrian!");
    }

    public NodePelanggan dequeue() {
        if (depan == null) return null;
        NodePelanggan dilayani = depan;
        depan = depan.next;
        if (depan == null) belakang = null;
        jumlah--;
        return dilayani;
    }

    public void tampilkan() {
        if (depan == null) {
            System.out.println("❌ Antrian kosong.");
            return;
        }

        System.out.println("\n📋 Antrian Pelanggan Saat Ini:");
        System.out.println("╔══════════════╦══════════════════════╦═══════════════╗");
        System.out.printf( "║ %-12s ║ %-20s ║ %-13s ║%n", "No. Antrian", "Nama", "Total Belanja");
        System.out.println("╠══════════════╬══════════════════════╬═══════════════╣");

        NodePelanggan tampung = depan;
        while (tampung != null) {
            System.out.printf("║ %-12s ║ %-20s ║ Rp%,-11.0f ║%n",
                tampung.nomorAntrian, tampung.namaPelanggan, tampung.totalBelanja);
            tampung = tampung.next;
        }

        System.out.println("╚══════════════╩══════════════════════╩═══════════════╝");
        System.out.println("Total Antrian: " + jumlah + " pelanggan");
    }

    public boolean isEmpty() { return depan == null; }
}

// ── STACK (Riwayat Transaksi) ────────────────────────────
class StackTransaksi {
    NodePelanggan atas;
    int jumlah = 0;

    public void push(NodePelanggan pelanggan) {
        pelanggan.next = atas;
        atas = pelanggan;
        jumlah++;
        System.out.println("📦 Transaksi disimpan ke riwayat.");
    }

    public void tampilkan() {
        if (atas == null) {
            System.out.println("❌ Belum ada riwayat transaksi.");
            return;
        }

        System.out.println("\n🧾 Riwayat Transaksi (Terbaru → Lama):");
        System.out.println("╔══════════════╦══════════════════════╦═══════════════╗");
        System.out.printf( "║ %-12s ║ %-20s ║ %-13s ║%n", "No. Antrian", "Nama", "Total Belanja");
        System.out.println("╠══════════════╬══════════════════════╬═══════════════╣");

        NodePelanggan tampung = atas;
        while (tampung != null) {
            System.out.printf("║ %-12s ║ %-20s ║ Rp%,-11.0f ║%n",
                tampung.nomorAntrian, tampung.namaPelanggan, tampung.totalBelanja);
            tampung = tampung.next;
        }

        System.out.println("╚══════════════╩══════════════════════╩═══════════════╝");
        System.out.println("Total Transaksi: " + jumlah);
    }
}

// ── MAIN ─────────────────────────────────────────────────
public class tugas2 {
    public static void main(String[] args) {
        QueuePelanggan antrian = new QueuePelanggan();
        StackTransaksi riwayat = new StackTransaksi();
        Scanner sc             = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan Nomor Antrian : ");
                    String nomor = sc.nextLine();
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Total Belanja : ");
                    double belanja = sc.nextDouble();
                    sc.nextLine();
                    antrian.enqueue(nomor, nama, belanja);
                    break;

                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println("❌ Tidak ada pelanggan dalam antrian.");
                        break;
                    }
                    NodePelanggan dilayani = antrian.dequeue();
                    System.out.println("\n🛒 Melayani pelanggan " + dilayani.nomorAntrian
                        + " (" + dilayani.namaPelanggan + ")");
                    System.out.printf("   Total Belanja: Rp%,.0f%n", dilayani.totalBelanja);
                    riwayat.push(dilayani);
                    break;

                case 3:
                    antrian.tampilkan();
                    break;

                case 4:
                    riwayat.tampilkan();
                    break;

                case 5:
                    if (riwayat.jumlah < 5) {
                        System.out.println("⚠️  Minimal 5 pelanggan harus dilayani dulu!");
                        System.out.println("   Sudah dilayani: " + riwayat.jumlah + " pelanggan.");
                        pilihan = 0;
                        break;
                    }
                    System.out.println("👋 Terima kasih! Sampai jumpa!");
                    break;

                default:
                    System.out.println("❌ Menu tidak valid!");
            }

        } while (pilihan != 5);

        sc.close();
    }
}