class stack1 {
    private int arr[];
    private int kapasitas;
    private int atas;

    stack1(int ukuran) {
        arr = new int[ukuran];
        kapasitas = ukuran;
        atas = -1;
    }

    void dorong(int nilai) {
        if (atas == kapasitas - 1) {
            System.out.println("Stack penuh, tidak bisa menambahkan elemen.");
            return;
        }
        arr[++atas] = nilai;
        System.out.println(nilai + " berhasil ditambahkan.");
    }

    void hapus() {
        if (atas == -1) {
            System.out.println("Stack kosong, tidak ada elemen untuk dihapus.");
            return;
        }
        System.out.println(arr[atas--] + " berhasil dihapus.");  // ← tambahan
    }

    void peak() {
        if (atas == -1) {
            System.out.println("Stack kosong, tidak ada elemen untuk dilihat.");
            return;
        }
        System.out.println("Elemen teratas: " + arr[atas]);  // ← tambahan
    }
}


public class vicon23Aprl26_3__Stack {
    public static void main(String[] args) {
        stack1 stack = new stack1(5);
        stack.dorong(10);
        stack.dorong(20);
        stack.dorong(30);
        stack.peak();
        stack.hapus();
        stack.peak();
    }
}