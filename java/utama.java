class iniNode {
    int data; // Menyimpan data
    iniNode next; //menunjuk ke node berikutnya

    public iniNode(int a) {
        this.data = a;
        this.next = null;
    }
}

public class utama {
    public static void main(String[] args) {
        iniNode kepala = new iniNode(10); // Membuat node pertama dengan data 10
        kepala.next = new iniNode(20); // Menambahkan node kedua dengan data 20

        System.out.println("Data pada node pertama: " + kepala.data); // Output: 10
        System.out.println("Data pada node kedua: " + kepala.next.data); // Output: 20
    }
}