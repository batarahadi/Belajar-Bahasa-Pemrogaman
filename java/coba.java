import java.util.Stack;

public class coba {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        System.out.println("melihat element saat ini = "+ a);

        // menambahkan elemen ke stack
        a.push(10);
        a.push(20);
        a.push(30);

        System.out.println("stack setelah push = " + a);

        //menghapus element paling akhir
        int elemenAtas = a.pop();

        System.out.println("elemen stelah di pop = " + elemenAtas);
        
        // melihat elemnt akhir
        System.out.println("element paling akhir saat ini = "+ a.peek());

        // memeriksa apakah stack kosong
        System.out.println("apakah stack kosong = "+ a.isEmpty());

        System.out.println("stack setelah push = " + a);
        
    }
}
