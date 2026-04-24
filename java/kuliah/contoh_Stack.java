package kuliah;
import java.util.Stack;

public class contoh_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Masukkan elemen (push)
        stack.push(3);  // [3]
        stack.push(2);  // [3, 2]
        stack.push(8);  // [3, 2, 8]

        System.out.println("Stack dengan push: " + stack);
        
        stack.add(5);   // [3, 2, 8, 5]
        stack.add(1);   // [3, 2, 8, 5, 1]

        System.out.println("Stack dengan add: " + stack);

        // Intip elemen teratas (peek)
        System.out.println("Teratas: " + stack.peek());

        // Ambil & hapus elemen teratas (pop)
        System.out.println(stack.pop()); // → 1 khusus untuk Stack, pop() akan menghapus elemen terakhir yang ditambahkan (LIFO)
        System.out.println(stack.pop()); // → 5
        System.out.println(stack.pop()); // → 8

        // Cek apakah kosong
        System.out.println("Kosong? " + stack.isEmpty()); // → true
        System.out.println("Stack sekarang: " + stack); // → []

    }
}