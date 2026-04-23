class node1 {
    int data;
    node1 selanjutnya;

    node1(int a) {
        this.data = a;
        this.selanjutnya = null;
    }
}

class linkList {
    node1 head;

    void masukan(int b) {
        node1 n = new node1(b);
        if (head == null) {
            head = n;
        } else {
            node1 temp = head;
            while (temp.selanjutnya != null) {
                temp = temp.selanjutnya;
            }
            temp.selanjutnya = n;
        }
    }

    void tampilkan () {
        node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.selanjutnya;
        }
    }
    
    void masukanDepan(int c) {
        node1 n = new node1(c);
        n.selanjutnya = head;
        head = n;
    }

    void hapus(int d) {
        node1 tujuan = head, prev = null;
        if ( tujuan != null && tujuan.data == d) {
            head = tujuan.selanjutnya;
            return;
        }  
        while (tujuan != null && tujuan.data != d) {
            prev = tujuan;
            tujuan = tujuan.selanjutnya;
        }
        if (tujuan == null) return;
        prev.selanjutnya = tujuan.selanjutnya;
    }
}

public class vicon23Aprl26_1 {
    public static void main(String[] args) {
        linkList list = new linkList();
        list.masukan(10);
        list.masukan(20);
        list.masukan(30);
        list.tampilkan();
        System.out.println();
        list.masukanDepan(5);
        list.tampilkan();

        System.out.println();
        list.hapus(20);
        list.tampilkan();
    }
}
