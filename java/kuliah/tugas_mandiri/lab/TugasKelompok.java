package kuliah.tugas_mandiri.lab;
import java.util.Scanner;

// ╔══════════════════════════════════════════════════╗
// ║           A. QUEUE — Antrian Customer Service                            ║
// ╚══════════════════════════════════════════════════╝

class NodePelanggan {
    String nomorAntrian, nama;
    NodePelanggan next;

    NodePelanggan(String nomorAntrian, String nama) {
        this.nomorAntrian = nomorAntrian;
        this.nama         = nama;
        this.next         = null;
    }
}

class QueueCustomerService {
    NodePelanggan depan, belakang;
    int jumlah = 0;

    public void enqueue(String nomor, String nama) {
        NodePelanggan baru = new NodePelanggan(nomor, nama);
        if (belakang != null) belakang.next = baru;
        belakang = baru;
        if (depan == null) depan = baru;
        jumlah++;
        System.out.println("✅ " + nama + " ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (depan == null) {
            System.out.println("❌ Antrian kosong.");
            return;
        }
        System.out.println("🛎️  Melayani pelanggan: " + depan.nama);
        depan = depan.next;
        if (depan == null) belakang = null;
        jumlah--;
    }

    public void tampilkan() {
        if (depan == null) {
            System.out.println("❌ Antrian kosong.");
            return;
        }
        System.out.println("\n📋 Pelanggan dalam antrian:");
        NodePelanggan tampung = depan;
        int urutan = 1;
        while (tampung != null) {
            System.out.printf("   %d. [%s] %s%n", urutan++, tampung.nomorAntrian, tampung.nama);
            tampung = tampung.next;
        }
        System.out.println("   Total: " + jumlah + " pelanggan");
    }

    public boolean isEmpty() { return depan == null; }
}


// ╔══════════════════════════════════════════════════╗
// ║           B. STACK — Undo/Redo Editor Teks                                 ║
// ╚══════════════════════════════════════════════════╝


// B. STACK — Undo/Redo Editor Teks
class NodeTeks {
    String teks;
    NodeTeks next;
    NodeTeks(String teks) { this.teks = teks; }
}

class EditorTeks {
    NodeTeks undoStack; // histori perubahan
    NodeTeks redoStack; // histori undo
    String teksSaatIni = "";

    public void tambahTeks(String tambahan) {
        // Simpan kondisi sebelumnya ke undoStack
        NodeTeks simpan = new NodeTeks(teksSaatIni);
        simpan.next  = undoStack;
        undoStack    = simpan;
        redoStack    = null; // reset redo saat ada perubahan baru
        teksSaatIni += tambahan;
        System.out.println("Teks saat ini: \"" + teksSaatIni + "\"");
    }

    public void undo() {
        if (undoStack == null) {
            System.out.println("Tidak ada yang bisa di-undo.");
            return;
        }
        // Simpan kondisi saat ini ke redoStack
        NodeTeks simpan = new NodeTeks(teksSaatIni);
        simpan.next = redoStack;
        redoStack   = simpan;
        // Kembalikan ke kondisi sebelumnya
        teksSaatIni = undoStack.teks;
        undoStack   = undoStack.next;
        System.out.println("Undo: \"" + teksSaatIni + "\"");
    }

    public void redo() {
        if (redoStack == null) {
            System.out.println("Tidak ada yang bisa di-redo.");
            return;
        }
        // Simpan kondisi saat ini ke undoStack
        NodeTeks simpan = new NodeTeks(teksSaatIni);
        simpan.next = undoStack;
        undoStack   = simpan;
        // Kembalikan ke kondisi redo
        teksSaatIni = redoStack.teks;
        redoStack   = redoStack.next;
        System.out.println("Redo: \"" + teksSaatIni + "\"");
    }

    public void tampilkan() {
        System.out.println("Teks saat ini: \"" + teksSaatIni + "\"");
    }
}


// ╔══════════════════════════════════════════════════╗
// ║       C. LINKED LIST — Manajemen Mahasiswa                            ║
// ╚══════════════════════════════════════════════════╝

class NodeMahasiswa {
    String nim, nama;
    double nilai;
    NodeMahasiswa next;

    NodeMahasiswa(String nim, String nama, double nilai) {
        this.nim   = nim;
        this.nama  = nama;
        this.nilai = nilai;
        this.next  = null;
    }

    // Getter & Setter
    public String getNim()        { return nim; }
    public String getNama()       { return nama; }
    public double getNilai()      { return nilai; }
    public void setNilai(double n){ this.nilai = n; }
}

class LinkedListMahasiswa {
    NodeMahasiswa head;
    int jumlah = 0;

    public void tambah(String nim, String nama, double nilai) {
        NodeMahasiswa baru = new NodeMahasiswa(nim, nama, nilai);
        if (head == null) {
            head = baru;
        } else {
            NodeMahasiswa tampung = head;
            while (tampung.next != null) tampung = tampung.next;
            tampung.next = baru;
        }
        jumlah++;
        System.out.println("✅ Mahasiswa " + nama + " berhasil ditambahkan.");
    }

    public void hapus(String nim) {
        if (head == null) { System.out.println("❌ Data kosong."); return; }
        if (head.getNim().equals(nim)) {
            System.out.println("🗑️  Menghapus: " + head.getNama());
            head = head.next;
            jumlah--;
            return;
        }
        NodeMahasiswa tampung = head;
        while (tampung.next != null && !tampung.next.getNim().equals(nim)) {
            tampung = tampung.next;
        }
        if (tampung.next == null) {
            System.out.println("❌ NIM tidak ditemukan.");
            return;
        }
        System.out.println("🗑️  Menghapus: " + tampung.next.getNama());
        tampung.next = tampung.next.next;
        jumlah--;
    }

    public void update(String nim, double nilaiBaruParam) {
        NodeMahasiswa tampung = head;
        while (tampung != null) {
            if (tampung.getNim().equals(nim)) {
                System.out.printf("🔄 Update nilai %s: %.1f → %.1f%n",
                    tampung.getNama(), tampung.getNilai(), nilaiBaruParam);
                tampung.setNilai(nilaiBaruParam);
                return;
            }
            tampung = tampung.next;
        }
        System.out.println("❌ NIM tidak ditemukan.");
    }

    public void tampilkan() {
        if (head == null) { System.out.println("❌ Data mahasiswa kosong."); return; }
        System.out.println("\n🎓 Daftar Mahasiswa:");
        System.out.println("╔═════════════╦══════════════════════╦════════╗");
        System.out.printf( "║ %-11s ║ %-20s ║ %-6s ║%n", "NIM", "Nama", "Nilai");
        System.out.println("╠═════════════╬══════════════════════╬════════╣");
        NodeMahasiswa tampung = head;
        int urutan = 1;
        while (tampung != null) {
            System.out.printf("║ %-11s ║ %-20s ║ %-6.1f ║%n",
                tampung.getNim(), tampung.getNama(), tampung.getNilai());
            tampung = tampung.next;
            urutan++;
        }
        System.out.println("╚═════════════╩══════════════════════╩════════╝");
        System.out.println("Total: " + jumlah + " mahasiswa");
    }
}


// ╔══════════════════════════════════════════════════╗
// ║                     MAIN                                                                      ║
// ╚══════════════════════════════════════════════════╝

public class TugasKelompok {
    public static void main(String[] args) {
        QueueCustomerService antrian = new QueueCustomerService();
        EditorTeks           editor  = new EditorTeks();
        LinkedListMahasiswa  mhs     = new LinkedListMahasiswa();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║     SISTEM MANAJEMEN DATA        ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  [A] QUEUE — Customer Service    ║");
            System.out.println("║  1. Tambah Pelanggan             ║");
            System.out.println("║  2. Layani Pelanggan             ║");
            System.out.println("║  3. Tampilkan Antrian            ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  [B] STACK — Editor Teks         ║");
            System.out.println("║  4. Tambah Teks                  ║");
            System.out.println("║  5. Undo                         ║");
            System.out.println("║  6. Redo                         ║");
            System.out.println("║  7. Tampilkan Teks               ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  [C] LINKED LIST — Mahasiswa     ║");
            System.out.println("║  8. Tambah Mahasiswa             ║");
            System.out.println("║  9. Hapus Mahasiswa              ║");
            System.out.println("║  10. Update Nilai                ║");
            System.out.println("║  11. Tampilkan Mahasiswa         ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  12. Analisis Waktu Eksekusi     ║");
            System.out.println("║  0. Keluar                       ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                // ── QUEUE ──
                case 1:
                    System.out.print("Nomor Antrian: ");
                    String nomor = sc.nextLine();
                    System.out.print("Nama Pelanggan: ");
                    String namaPelanggan = sc.nextLine();
                    antrian.enqueue(nomor, namaPelanggan);
                    break;
                case 2: antrian.dequeue();   break;
                case 3: antrian.tampilkan(); break;

                // ── STACK ──
                case 4:
                    System.out.print("Tambah teks: ");
                    String teks = sc.nextLine();
                    editor.tambahTeks(teks);
                    break;
                case 5: editor.undo();      break;
                case 6: editor.redo();      break;
                case 7: editor.tampilkan(); break;

                // ── LINKED LIST ──
                case 8:
                    System.out.print("NIM   : "); String nim  = sc.nextLine();
                    System.out.print("Nama  : "); String nama = sc.nextLine();
                    System.out.print("Nilai : "); double nilai = sc.nextDouble(); sc.nextLine();
                    mhs.tambah(nim, nama, nilai);
                    break;
                case 9:
                    System.out.print("NIM yang dihapus: ");
                    mhs.hapus(sc.nextLine());
                    break;
                case 10:
                    System.out.print("NIM yang diupdate: "); String nimUpdate = sc.nextLine();
                    System.out.print("Nilai baru       : "); double nilaiBaru = sc.nextDouble(); sc.nextLine();
                    mhs.update(nimUpdate, nilaiBaru);
                    break;
                case 11: mhs.tampilkan(); break;

                // ── ANALISIS WAKTU ──
                case 12: analisisWaktu(); break;

                case 0:
                    System.out.println("👋 Terima kasih!");
                    break;

                default:
                    System.out.println("❌ Menu tidak valid!");
            }

        } while (menu != 0);
        sc.close();
    }

    // ── ANALISIS WAKTU EKSEKUSI ──────────────────────────
    static void analisisWaktu() {
        System.out.println("\n⏱️  Analisis Waktu Eksekusi (1000 operasi):");
        System.out.println("─────────────────────────────────────────");

        // Queue
        QueueCustomerService q = new QueueCustomerService();
        long mulai = System.nanoTime();
        for (int i = 0; i < 1000; i++) q.enqueue("A" + i, "Pelanggan" + i);
        for (int i = 0; i < 1000; i++) q.dequeue();
        long selesai = System.nanoTime();
        System.out.printf("Queue  (enqueue+dequeue) : %,d ns%n", selesai - mulai);

        // Stack (Editor Teks)
        EditorTeks e = new EditorTeks();
        mulai = System.nanoTime();
        for (int i = 0; i < 1000; i++) e.tambahTeks("kata");
        for (int i = 0; i < 1000; i++) e.undo();
        selesai = System.nanoTime();
        System.out.printf("Stack  (push+undo)        : %,d ns%n", selesai - mulai);

        // Linked List
        LinkedListMahasiswa ll = new LinkedListMahasiswa();
        mulai = System.nanoTime();
        for (int i = 0; i < 1000; i++) ll.tambah("NIM" + i, "Mhs" + i, 80);
        for (int i = 0; i < 1000; i++) ll.hapus("NIM" + i);
        selesai = System.nanoTime();
        System.out.printf("Linked List (tambah+hapus): %,d ns%n", selesai - mulai);

        System.out.println("─────────────────────────────────────────");
        System.out.println("📊 Kesimpulan:");
        System.out.println("   Queue  → O(1) untuk enqueue & dequeue");
        System.out.println("   Stack  → O(1) untuk push & undo/redo");
        System.out.println("   LL     → O(1) tambah depan, O(n) hapus tengah");
    }
}