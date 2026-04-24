class Queue1 {
    private int arr[];
    private int depan, belakang, kapasitas;

    Queue1(int ukran) {
        arr = new int[ukran];
        kapasitas = ukran;
        depan = -1;
        belakang = -1;
    }

    void enqueue(int nilai) {
        if (belakang == kapasitas -1) {
            System.out.println("Queue penuh, tidak bisa menambahkan elemen.");
            return;
        }
        if (depan == -1) depan = 0;
        arr[++belakang] = nilai;
    }

    int dequeue() {
        if (depan == -1 || depan > belakang) {
            System.out.println("Queue kosong, tidak ada elemen untuk dihapus.");
            return -1; // Mengembalikan nilai -1 sebagai indikator queue kosong
        }
        return arr[depan++];
    }
    
    boolean isKosong() {
        if (depan == -1 || depan > belakang) {
            return true;
        }
        return false;
    }
}

public class vicon23Aprl26_3__queue {
    static void penjumlahan(int a, int b) {
        System.out.println("Hasil penjumlahan: " + (a + b));
    }

    int pengurangan(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Queue1 queue = new Queue1(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.isKosong();
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("apakah queue kosong? " + queue.isKosong());

        vicon23Aprl26_3__queue.penjumlahan(5, 3);
        vicon23Aprl26_3__queue stack = new vicon23Aprl26_3__queue();
        int hasilPengurangan = stack.pengurangan(10, 4);
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
    }
}
