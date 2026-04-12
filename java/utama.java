class iniNode {
    int isiData; 
    iniNode nextAja; 

    public iniNode(int a) {
        this.isiData = a;
        this.nextAja = null;
    }
}

public class utama {
    // Baris 13: 'wadahData' adalah label kiriman, 'inputAngka' adalah nilai baru
    public static void tambahDiUjung(iniNode wadahData, int inputAngka) {
        iniNode ciptaNode = new iniNode(inputAngka); // [cite: 276]
        iniNode petugasCari = wadahData; // Petugas mulai dari alamat yang dikirim 

        // --- ALUR KERJA PETUGAS (TRAVERSAL) ---
        // Petugas ngecek tangan 'nextAja' satu-satu sampai ketemu yang kosong [cite: 281]
        while (petugasCari.nextAja != null) {
            petugasCari = petugasCari.nextAja; // Langkah maju [cite: 282]
        }

        // Tangan si petugas yang di ujung sekarang megang node baru 
        petugasCari.nextAja = ciptaNode;
    }

    public static void main(String[] args) {
        // 'titikAwal' adalah jangkar utama di memori
        iniNode titikAwal = new iniNode(10); 

        // Kita oper 'titikAwal' ke fungsi. Di sana, dia bakal dijulukin 'wadahData'
        tambahDiUjung(titikAwal, 20); 
        tambahDiUjung(titikAwal, 30);

        // 'tukangCek' buat nampilin hasil tanpa ngerusak 'titikAwal'
        iniNode tukangCek = titikAwal;
        System.out.print("Rantai: ");
        while (tukangCek != null) {
            System.out.print(tukangCek.isiData + " -> ");
            tukangCek = tukangCek.nextAja;
        }
        System.out.println("null");
    }
}