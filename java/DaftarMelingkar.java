class Simpul {
    int angka;
    Simpul berikutnya;

    Simpul(int nilai) {
        angka = nilai;
        berikutnya = null;
    }
}

public class DaftarMelingkar {
    static Simpul tambahDiAwal(Simpul ekorList, int nilaBaru) {
        Simpul simpulBaru = new Simpul(nilaBaru);
        if (ekorList == null) {
            simpulBaru.berikutnya = simpulBaru;
            return simpulBaru;
        }
        simpulBaru.berikutnya = ekorList.berikutnya;
        ekorList.berikutnya = simpulBaru;
        return ekorList;
    }
    static void tampilkanList(Simpul ekorList) {
        if (ekorList == null) return;
        Simpul kepala = ekorList.berikutnya;
        Simpul posisiSaatIni = kepala;
        do {
            System.out.print(posisiSaatIni.angka);
            posisiSaatIni = posisiSaatIni.berikutnya;
            if (posisiSaatIni != kepala) System.out.print(" -> ");
        } while (posisiSaatIni != kepala);
        System.out.println();
    }

    public static void main(String[] args) {
        Simpul simpulPertama = new Simpul(2);
        simpulPertama.berikutnya = new Simpul(3);
        simpulPertama.berikutnya.berikutnya = new Simpul(4);
        Simpul ekor = simpulPertama.berikutnya.berikutnya;
        ekor.berikutnya = simpulPertama;

        System.out.print("Sebelum: ");
        tampilkanList(ekor);

        ekor = tambahDiAwal(ekor, 5);

        System.out.print("Sesudah: ");
        tampilkanList(ekor);
    }
}