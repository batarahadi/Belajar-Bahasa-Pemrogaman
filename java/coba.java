import java.util.Stack;

public class coba {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // menambahkan elemen ke stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack setelah push: " + stack);

        // melihat elemen teratas
        int topElement = stack.peek();
        System.out.println("Elemen teratas: " + topElement);

        // menghapus elemen teratas
        int poppedElement = stack.pop();
        System.out.println("Elemen yang di-pop: " + poppedElement);
        System.out.println("Stack setelah pop: " + stack);

        // memeriksa apakah stack kosong        boolean isEmpty = stack.isEmpty();
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
        
    }
}
