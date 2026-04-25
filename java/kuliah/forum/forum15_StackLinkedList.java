package kuliah.forum;

public class forum15_StackLinkedList {

    // Node
    class Node {
        int data;
        Node selanjutnya;
        Node(int d) { data = d; }
    }

    Node atas;
    // Masukkan elemen
    public void push(int nilai) {
        Node baru = new Node(nilai);
        baru.selanjutnya = atas;
        atas = baru;
    }

    // Keluarkan elemen
    public int pop() {
        if (atas == null) {
            System.out.println("Stack kosong!");
            return -1;
        }
        int nilai = atas.data;
        atas = atas.selanjutnya;
        return nilai;
    }

    // Intip elemen teratas
    public int peek() {
        return atas.data;
    }

    // Tampilkan semua elemen
    public void tampilkan() {
        Node tampung = atas;
        System.out.print("Stack: ");
        while (tampung != null) {
            System.out.print(tampung.data + " ");
            tampung = tampung.selanjutnya;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        forum15_StackLinkedList stack = new forum15_StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.tampilkan(); // → 30 20 10

        System.out.println("Keluar: " + stack.pop()); // → 30
        System.out.println("Keluar: " + stack.pop()); // → 20
        stack.tampilkan(); // → 10
    }
}