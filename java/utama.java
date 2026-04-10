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
        
        iniNode kotakBaru = new iniNode(30); // Membuat node baru dengan data 30
        iniNode kurir = kepala; // Menggunakan kurir untuk menelusuri linked list

        while (kurir.next != null) {
            kurir = kurir.next;
        }

        kurir.next = kotakBaru; // Menambahkan node baru di akhir linked

        System.out.printf("Isi Linked List: %d %n", kurir.next.data); 
    }
}