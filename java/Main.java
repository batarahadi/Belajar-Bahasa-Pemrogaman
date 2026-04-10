// Kelas iniNode untuk merepresentasikan setiap elemen
class iniNode {
    int data;     // Menyimpan data
    iniNode next;    // Menunjuk ke node berikutnya

    // Konstruktor untuk membuat node baru
    public iniNode(int a) {
        this.data = a;
        this.next = null;
    }
}

// Kelas utama Singly Linked List
class SinglyLinkedList {
    iniNode head;

    // 1. Menyisipkan elemen di awal (Insert at Head)
    // Kompleksitas Waktu: O(1)
    public void insertAtHead(int data) {
        iniNode newNode = new iniNode(data); // Membuat node baru
        newNode.next = head;           // iniNode baru menunjuk ke node pertama saat ini
        head = newNode;                // Memperbarui head agar menunjuk ke node baru
    }

    // 2. Menyisipkan elemen di akhir (Insert at Tail)
    // Kompleksitas Waktu: O(n)
    public void insertAtTail(int data) {
        iniNode newNode = new iniNode(data);
        
        if (head == null) {
            head = newNode; // Jika daftar kosong, node baru langsung menjadi head
        } else {
            iniNode current = head;
            // Menelusuri node satu per satu hingga menemukan node terakhir
            while (current.next != null) { 
                current = current.next;
            }
            current.next = newNode; // Menghubungkan node terakhir dengan node baru
        }
    }

    // 3. Menghapus elemen di awal (Remove from Head)
    // Kompleksitas Waktu: O(1)
    public void removeHead() {
        if (head != null) {
            head = head.next; // Menggeser head ke node berikutnya
        } else {
            System.out.println("Linked List sudah kosong.");
        }
    }

    // 4. Menampilkan isi linked list (Traversal)
    public void display() {
        iniNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Kelas Main untuk menguji (Test) kode
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("--- Uji Insert at Tail ---");
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        System.out.println("\n--- Uji Insert at Head ---");
        list.insertAtHead(5);
        list.display(); // Output: 5 -> 10 -> 20 -> 30 -> null

        System.out.println("\n--- Uji Remove from Head ---");
        list.removeHead();
        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
}