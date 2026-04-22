class Node {
    int data;
    Node sebelum, selanjutnya;
    Node(int d) { 
        data = d; }
}

public class teras {
    Node head;

    public void hapusNode(Node target) {
        if (head == null || target == null) return;

        if (head == target) {
            head = target.selanjutnya;
        if (head != null) head.sebelum = null;
            return; // langsung keluar
        }

        if (target.sebelum != null) {
            target.sebelum.selanjutnya = target.selanjutnya;
        }

        if (target.selanjutnya != null) {
            target.selanjutnya.sebelum = target.sebelum;
        }
    }
    public static void main(String[] args) {
        teras list = new teras();

        list.head = new Node(1);
        Node keDua = new Node(2);
        Node keTiga = new Node(3);

        list.head.selanjutnya = keDua;
        keDua.sebelum = list.head;
        keDua.selanjutnya = keTiga;
        keTiga.sebelum = keDua;

        list.hapusNode(keTiga);

        Node tampung = list.head;
        while (tampung != null) {
            System.out.print(tampung.data + " ");
            tampung = tampung.selanjutnya;
        }
    }
}
