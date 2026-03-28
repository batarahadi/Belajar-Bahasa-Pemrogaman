package belajar;

/*   Belajar Java [Dasar] - 15 - Operator Logika


READ ME

Jalan kan perintah di terminal
1. javac ../src/com/belajar/o8.java -d ../bin
2. java com.belajar.o8

*/

public class o15 {
    public static void main(String[] args) {
        
        // Operator Logika -- operasi yang dapat kita lakukan pada tipe data boolean
        // OR (||), AND (&&),  XOR (^), negasi (!)

        boolean a,b,c;

        // OR / atau (||)
        System.out.println("===== OR / atau (||) =====");
        a = false;
        b = false;
        c = a || b; // true || true = true
        System.out.printf("%b || %b = %b\n", a, b, c);
        a = false;
        b = true;
        c = a || b; // true || true = true
        System.out.printf("%b || %b = %b\n", a, b, c);
        a = true;
        b = false;
        c = a || b; // true || true = true
        System.out.printf("%b || %b = %b\n", a, b, c);
        a = true;
        b = true;
        c = a || b; // true || true = true
        System.out.printf("%b || %b = %b\n", a, b, c);

        // AND / dan (&&)
        System.out.println("===== AND / dan (&&) =====");
        a = false;
        b = false;
        c = a && b; // false && false = false
        System.out.printf("%b && %b = %b\n", a, b, c);
        a = false;
        b = true;
        c = a && b; // false && true = false
        System.out.printf("%b && %b = %b\n", a, b, c);
        a = true;
        b = false;
        c = a && b; // true && false = false
        System.out.printf("%b && %b = %b\n", a, b, c);
        a = true;
        b = true;
        c = a && b; // true && true = true
        System.out.printf("%b && %b = %b\n", a, b, c);

        // XOR / exclusive or (^)
        System.out.println("===== XOR / exclusive or (^) =====");
        a = false;
        b = false;
        c = a ^ b; // false ^ false = false
        System.out.printf("%b ^ %b = %b\n", a, b, c );
        a = false;
        b = true;
        c = a ^ b; // false ^ true = true
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        a = true;
        b = false;
        c = a ^ b; // true ^ false = true
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        a = true;
        b = true;
        c = a ^ b; // true ^ true = false
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        // Negasi / NOT (!)
        System.out.println("===== Negasi / NOT (!) =====");
        a = false;
        c = !a; // !false = true
        System.out.printf("!%b = %b\n", a, c);
        a = true;
        c = !a; // !true = false
        System.out.printf("!%b = %b\n", a, c);
        
    }
}
