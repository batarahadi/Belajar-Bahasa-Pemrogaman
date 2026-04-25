package kuliah.forum;
public class forum15_StackArray {
    int[] data = new int[5]; // kapasitas maksimal 5
    int atas = -1;

    // Masukkan elemen
    public void push(int nilai) {
        if (atas == data.length - 1) {
            System.out.println("Stack penuh!");
            return;
        }
        atas++;
        data[atas] = nilai;
    }

    // Keluarkan elemen
    public int pop() {
        if (atas == -1) {
            System.out.println("Stack kosong!");
            return -1;
        }
        int nilai = data[atas];
        atas--;
        return nilai;
    }

    // Intip elemen teratas
    public int peek() {
        return data[atas];
    }

    // Cek kosong
    public boolean isEmpty() {
        return atas == -1;
    }

    public static void main(String[] args) {
        forum15_StackArray stack = new forum15_StackArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Teratas  : " + stack.peek());  // → 30
        System.out.println("Keluar   : " + stack.pop());   // → 30
        System.out.println("Keluar   : " + stack.pop());   // → 20
        System.out.println("Kosong?  : " + stack.isEmpty()); // → false
    }
}