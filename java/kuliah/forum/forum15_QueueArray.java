package kuliah.forum;
public class forum15_QueueArray {
    int[] data = new int[5]; // kapasitas maksimal 5
    int depan = 0, belakang = 0;

    // Masukkan elemen
    public void enqueue(int nilai) {
        if (belakang == data.length) {
            System.out.println("Queue penuh!");
            return;
        }
        data[belakang] = nilai;
        belakang++;
    }

    // Keluarkan elemen
    public int dequeue() {
        if (depan == belakang) {
            System.out.println("Queue kosong!");
            return -1;
        }
        int nilai = data[depan];
        depan++;
        return nilai;
    }

    // Intip elemen terdepan
    public int peek() {
        return data[depan];
    }

    // Cek kosong
    public boolean isEmpty() {
        return depan == belakang;
    }

    public static void main(String[] args) {
        forum15_QueueArray queue = new forum15_QueueArray();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Terdepan : " + queue.peek());    // → 10
        System.out.println("Keluar   : " + queue.dequeue()); // → 10
        System.out.println("Keluar   : " + queue.dequeue()); // → 20
        System.out.println("Kosong?  : " + queue.isEmpty()); // → false
    }
}