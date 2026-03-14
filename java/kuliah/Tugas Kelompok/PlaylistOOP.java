/*
2902743763 - BATARA HADI PRAYITNO
2902742861 - DIRK EIBEL LAMBANG
2902692844 - JERI IRAWAN
2902703293 - JOSUA EMANUELLE ARSETO
2602211871 - MATIAS NDAWA ATA BARA
 */


// Class Lagu
class Lagu {
    private String judul;
    private String artis;
    private double durasi;

    public Lagu(String judul, String artis, double durasi) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    public String getJudul() { return judul; }
    public String getArtis() { return artis; }
    public double getDurasi() { return durasi; }

    // Method untuk menampilkan informasi lagu
    public void tampilkanInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Artis       : " + artis);
        System.out.println("Durasi lagu : " + durasi + " menit");
    }
}

// Class User sebagai parent class untuk Admin dan Member
abstract class User { // Abstract class untuk User, Mencegah Pembuatan Objek "User" yang Tidak Jelas Perannya
    protected String nama;

    User(String nama) {
        this.nama = nama;
    }

    public abstract void tampilkanAkses();
}


// Class Admin
class Admin extends User {
    Admin(String nama) {
        super(nama);
    }

    @Override
    public void tampilkanAkses() {
        System.out.println("Akses " + nama + " (Admin): Dapat menambahkan lagu baru ke playlist.");
    }

    // fitur khusu Admin untuk menambahkan lagu ke playlist
    public int tambahLagu(Lagu[] listLagu, int jumlahLagu, Lagu laguBaru) {
        if (jumlahLagu < listLagu.length) {
            listLagu[jumlahLagu] = laguBaru;
            System.out.println("Berhasil menambahkan lagu: " + laguBaru.getJudul());
            return jumlahLagu + 1;
        } else {
            System.out.println("Playlist penuh! Tidak dapat menambahkan lagu baru.");
            return jumlahLagu;
        }
    }
}

// Class Member
class Member extends User {

    Member(String nama) {
        super(nama);
    }

    @Override
    public void tampilkanAkses() {
        System.out.println("Akses " + nama + " (Member): Dapat melihat daftar lagu dalam playlist.");
    }

    // fitur khusus Member untuk melihat daftar lagu dalam playlist
    public void lihatDaftarLagu(Lagu[] listLagu, int jumlahLagu) {
        System.out.println("Daftar Lagu dalam Playlist:");
        for (int i = 0; i < jumlahLagu; i++) {
            if (listLagu[i] != null) {
                listLagu[i].tampilkanInfo();
                System.out.println();
            }
        }
    }

    // fitur khusus Member untuk mencari lagu berdasarkan judul
    public void cariLagu(Lagu[] listLagu, String judul) {
        boolean ditemukan = false;
        for (Lagu lagu : listLagu) {
            if (lagu != null && lagu.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Lagu ditemukan: " + lagu.getJudul() + " oleh " + lagu.getArtis());
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Lagu dengan judul '" + judul + "' tidak ditemukan dalam playlist.");
        }
    }
} 

// Main class untuk menjalankan program utama
public class PlaylistOOP {
    public static void main(String[] args) {
        Lagu[] listLagu = new Lagu[100]; // Array untuk menyimpan lagu, kapasitas maksimal 100 lagu
        int jumlahLagu = 0;

        // Membuat objek Admin dan Member
        Admin admin   = new Admin("SuperUser");
        Member member = new Member("MemberUser");

        System.out.println("Informasi Akses:");
        admin.tampilkanAkses();
        member.tampilkanAkses();
        System.out.println();

        // Admin menambahkan lagu ke playlist
        System.out.println("====: Admin menambahkan lagu ke playlist :====");
        jumlahLagu = admin.tambahLagu(listLagu, jumlahLagu, new Lagu("The One That Got Away", "Katy Perry", 3.47));
        jumlahLagu = admin.tambahLagu(listLagu, jumlahLagu, new Lagu("Someone Like You", "Adele", 4.45));
        System.out.println();

        // Member melihat daftar lagu dalam playlist
        member.lihatDaftarLagu(listLagu, jumlahLagu);

        // Member mencari lagu berdasarkan judul
        member.cariLagu(listLagu, "The One That Got Away");
    }
}