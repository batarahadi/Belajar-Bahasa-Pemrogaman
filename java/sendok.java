class Node {
    int data;
    Node next, prev;

    Node(int d) {
        data = d;
    }
}

public class sendok {
    Node head = null;

    // Fungsi tambah data di akhir
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            Node tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Fungsi cetak data
    public void show() {
        if (head == null) return;
        
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        sendok list = new sendok();
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println("Isi Circular Doubly Linked List:");
        list.show();
    }
}