package kuliah;

class nodeSimpul {
    int data;
    nodeSimpul lanjut;

    public nodeSimpul(int x) {
        this.data = x;
        this.lanjut = null;
    }
}

class listGaris {
    nodeSimpul dataAwal;

    void tambah(int nilaiBaru) {
        nodeSimpul simpulBaru = new nodeSimpul(nilaiBaru);
        if (dataAwal == null) {
            dataAwal = simpulBaru;
        } else {
            nodeSimpul tampung = dataAwal;
            while (tampung.lanjut != null) {
                tampung = tampung.lanjut;
            }
            tampung.lanjut = simpulBaru;
        }
    }

    void tampilkanList() {
        nodeSimpul tampung = dataAwal;
        while (tampung != null) {
            System.out.println(tampung.data + " -> ");
            tampung = tampung.lanjut;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        listGaris list = new listGaris();
        list.tambah(5);
        list.tambah(2);
        list.tambah(3);

        list.tampilkanList();

    }
}
