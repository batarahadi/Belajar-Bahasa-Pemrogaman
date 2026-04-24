package kuliah;
import java.util.PriorityQueue;

public class contoh_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(3);

        System.out.printf("Priority Queue baru dibuat: %s\n", pq);

        pq.add(5);  // [5]
        pq.add(2);  // [2, 5]
        pq.add(8);  // [2, 5, 8]

        System.out.printf("Melihat Priority Queue dengan add: %s\n", pq); 

        // pq.push(3); // [2, 3, 5, 8]      Tidak akan bisa karena push() tidak ada di PriorityQueue, gunakan add() atau offer() untuk menambahkan elemen

        // System.out.printf("Melihat Priority Queue dengan push: %s\n", pq);  Tidak akan bisa

        System.out.printf("Priority Queue peek: %d\n", pq.peek());
        System.out.printf("Priority Queue poll: %d\n", pq.poll()); // → 2 khusus untuk PriorityQueue, poll() akan menghapus elemen dengan prioritas tertinggi (nilai terkecil)

        System.out.println("Priority Queue poll dengan loop: ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        
    }
}
