package belajar;

/*   Belajar Java [Dasar] - 16 - Operator Bitwise

READ ME

Jalan kan perintah di terminal
1. javac ../src/com/belajar/o8.java -d ../bin
2. java com.belajar.o8

*/

public class o16 {
    public static void main(String[] args) {
        
        // Opertor Bitwise -- operrator untuk melakukan operasi pada nilai bit
        // & (AND), | (OR), ^ (XOR), ~ (NOT),

        byte a = 3; // 0000 0011 (3)
        byte b, c;
        String aBits, bBits, cBits;

        aBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", aBits, a);

        // Operator SHIFT LEFT
        System.out.println("\n==== SHIFT LEFT (<<) ====");
        b = (byte) (a << 3); // 0001 1000 (24)
        bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", bBits, b);
        
        // Operator SHIFT RIGHT
        System.out.println("\n==== SHIFT RIGHT (>>) ====");
        a = 24; // 0001 1000 (24)
        aBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", aBits, a);
        b = (byte) (a >> 1); // 0000 0001 (1)
        bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", bBits, b);

        // Operator bitwise OR
        System.out.println("\n==== BITWISE OR (|) ====");
        a = 24; // 0001 1000 (24)
        aBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", aBits, a);
        b = 12; // 0000 1100 (12)
        bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", bBits, b);

        c = (byte) (a | b); // 0001 1100 (28)
        cBits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d  <<=== Ini bitwise OR \n", cBits, c);

        // Operator bitwise AND
        System.out.println("\n==== BITWISE AND (&) ====");
        a = 24; // 0001 1000 (24)
        aBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", aBits, a);
        b = 12; // 0000 1100 (12)
        bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", bBits, b);

        c = (byte) (a & b); // 0000 1000 (8)
        cBits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d  <<=== Ini bitwise AND \n", cBits, c);

        // Operator bitwise XOR
        System.out.println("\n==== BITWISE XOR (^) ====");
        a = 24; // 0001 1000 (24)
        aBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", aBits, a);
        b = 12; // 0000 1100 (12)
        bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", bBits, b);

        c = (byte) (a ^ b); // 0001 0100 (20)
        cBits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d  <<=== Ini bitwise XOR \n", cBits, c);

        // Operator bitwise Negasi / NOT
        System.out.println("\n==== BITWISE NOT (~) ====");
        a = 24; // 0001 1000 (24)
        b = (byte) (~a); // 1110 0111 (-25)
        aBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", aBits, a);
        bBits = String.format("%8s", Integer.toBinaryString(b)).substring(24); // ambil 8 bit terakhir
        System.out.printf("%s = %d <<=== Ini bitwise NOT \n", bBits, b);
    }
}