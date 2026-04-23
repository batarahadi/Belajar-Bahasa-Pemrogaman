class Queue1 {
    private int arr[];
    private int depan, belakang, kapasitas;

    Queue1(int ukran) {
        arr = new int[ukran];
        kapasitas = ukran;
        depan = -1;
        belakang = -1;
    }

    void enqueue(int a) {
        if (belakang == kapasitas -1) {
            System.out.println("Queue penuh, tidak bisa menambahkan elemen.");
            return;
        }
        if (depan == -1) depan = 0;
        arr[++belakang] = a;
    }

    int dequeue() {
        if (depan == -1 || depan > belakang) {
            System.out.println("Queue kosong, tidak ada elemen untuk dihapus.");
            return -1; // Mengembalikan nilai -1 sebagai indikator queue kosong
        }
        return arr[depan++];
    }
    
}

public class qDanStack {
    public static void main(String[] args) {
        
    }
}
