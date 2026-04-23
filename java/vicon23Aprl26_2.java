class node2 {
    int data;
    node2 selanjutnya, sebelumnya;

    node2(int a) {
        this.data = a;
        this.selanjutnya = null;
        this.sebelumnya = null;
    }
}

class linkList2 {
    node2 head;

    void masuk(int b) {
        node2 dataMasuk = new node2(b);
        
        if (head == null) {
            head = dataMasuk;
        } else {
            node2 tampung = head;
            while (tampung.selanjutnya != null) {
                tampung = tampung.selanjutnya;
            }
            tampung.selanjutnya = dataMasuk;
            dataMasuk.sebelumnya = tampung;
        }
    }

    void hapus(int c) {
        node2 dataHapus = head;

        while (dataHapus != null && dataHapus.data != c) {
            dataHapus = dataHapus.selanjutnya;             
        }

        if (dataHapus == null) return;

        if (dataHapus.sebelumnya != null) {
            dataHapus.sebelumnya.selanjutnya = dataHapus.selanjutnya;
        } else {
            head = dataHapus.selanjutnya; // Jika node yang dihapus adalah head
        }

        if (dataHapus.selanjutnya != null) {
            dataHapus.selanjutnya.sebelumnya = dataHapus.sebelumnya;
        }
    }

    void tampilkan() {
        node2 dataTampil = head;
        while (dataTampil != null) {
            System.out.print(dataTampil.data + " ");
            dataTampil = dataTampil.selanjutnya;
        }
        System.out.println();
    }

    void masukAkhir(int d) {
        node2 dataMasukAkhir = new node2(d);

        if (head == null) {
            head = dataMasukAkhir;
        } else {
            node2 tampung = head;
            while (tampung.selanjutnya != null) {
                tampung = tampung.selanjutnya;
            }
            tampung.selanjutnya = dataMasukAkhir;
            dataMasukAkhir.sebelumnya = tampung;
        }
        tampilkan();
    }

    void hapusIndex(int noIndex) {
        if (head == null) {
            System.out.println("List kosong, tidak ada yang bisa dihapus.");
            return;
        }

        node2 dataHapus = head;

        if (noIndex == 0) {
            head = dataHapus.selanjutnya;
            if (head != null) {
                head.sebelumnya = null;
            }
            return;
        }

        for (int i = 0; i < noIndex && dataHapus != null; i++) {
            dataHapus = dataHapus.selanjutnya;
        }

        if (dataHapus == null) {
            System.out.println("Index di luar batas, tidak ada yang bisa dihapus.");
            return;
        }

        if (dataHapus.selanjutnya != null) {
            dataHapus.selanjutnya.sebelumnya = dataHapus.sebelumnya;
        }

        tampilkan();
    }

    void reverseTraversal() {
        if (head == null) {
            System.out.println("List kosong, tidak ada yang bisa ditampilkan.");
            return;
        }

        node2 dataTampil = head;
        while (dataTampil.selanjutnya != null) {
            dataTampil = dataTampil.selanjutnya;
        }

        while (dataTampil != null) {
            System.out.print(dataTampil.data + " ");
            dataTampil = dataTampil.sebelumnya;
        }
        System.out.println();
    }
}

public class vicon23Aprl26_2 {
    public static void main(String[] args) {
        linkList2 list = new linkList2();
        list.masuk(10);
        list.masuk(20);
        list.masuk(30);
        list.tampilkan();
        list.hapus(20);
        list.tampilkan();
        list.masukAkhir(40);
        list.hapusIndex(1);
    }
}
