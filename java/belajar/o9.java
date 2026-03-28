/*   belajar Java [Dasar] - 09 - Tipe data fundamental atau Primitive


READ ME

Jalan kan perintah di terminal
1. javac ../src/com/belajar/o8.java -d ../bin
2. java com.belajar.o8

*/


package belajar;

public class o9 {
    public static void main(String[] args) {
        /*
        tipe data di java:
        integer, byte, short, long, double, float, char, boolean
        */

        // integer (satuan)
        int i = 1;
        System.out.println("=====INTEGER======");
        System.out.printf("nilai int : %d\n", i);
        System.out.printf("nilai max int : %d\n", Integer.MAX_VALUE);
        System.out.printf("nilai min int : %d\n", Integer.MIN_VALUE);
        System.out.printf("Besar int : %d byte\n", Integer.BYTES);
        System.out.printf("besar int : %d bit\n", Integer.SIZE);

        // byte
        byte b = 10;
        System.out.println("\n=====BYTE======");
        System.out.printf("nilai byte : %d\n", b);
        System.out.printf("nilai max byte : %d\n", Byte.MAX_VALUE);
        System.out.printf("nilai min byte : %d\n", Byte.MIN_VALUE);
        System.out.printf("besar byte : %d byte\n", Byte.BYTES);
        System.out.printf("besar byte : %d bit\n", Byte.SIZE);

        // short
        short s = 10;
        System.out.println("\n=====SHORT======");
        System.out.printf("nilai short : %d\n", s);
        System.out.printf("nilai max short : %d\n", Short.MAX_VALUE);
        System.out.printf("nilai min short : %d\n", Short.MIN_VALUE);
        System.out.printf("besar short : %d byte\n", Short.BYTES);
        System.out.printf("besar short : %d bit\n", Short.SIZE);

        // long
        long l = 10L;
        System.out.println("\n=====LONG======");
        System.out.printf("nilai long : %d\n", l);
        System.out.printf("nilai max long : %d\n", Long.MAX_VALUE);
        System.out.printf("nilai min long : %d\n", Long.MIN_VALUE);
        System.out.printf("besar long : %d byte\n", Long.BYTES);
        System.out.printf("besar long : %d bit\n", Long.SIZE);

        // double (pecahan/desimal, lebih presisi dari pada float)
        
        /*wajib menggunakan d atau D di akhir angka 
        untuk menandakan bahwa ini adalah double, 
        jika tidak maka akan dianggap sebagai float */
        
        double d = 10.5d; 
        System.out.println("\n=====DOUBLE======");
        System.out.printf("nilai double : %f\n", d);
        System.out.printf("nilai max double : %f\n", Double.MAX_VALUE);
        System.out.printf("nilai min double : %f\n", Double.MIN_VALUE);
        System.out.printf("besar double : %d byte\n", Double.BYTES);
        System.out.printf("besar double : %d bit\n", Double.SIZE);

        // float (pecahan/desimal)
        /*wajib menggunakan f atau F di akhir angka 
        untuk menandakan bahwa ini adalah float, 
        jika tidak maka akan dianggap sebagai double */
        float f = 10.5f;
        System.out.println("\n=====FLOAT======");
        System.out.printf("nilai float : %f\n", f);
        System.out.printf("nilai max float : %f\n", Float.MAX_VALUE);
        System.out.printf("nilai min float : %f\n", Float.MIN_VALUE);
        System.out.printf("besar float : %d byte\n", Float.BYTES);
        System.out.printf("besar float : %d bit\n", Float.SIZE);

        // char (karakter) 

        /*harus menggunakan ' ' (tanda petik 1), 
        dan di dalam tanda petik 1 hanya boleh 1 karakter, 
        jika lebih dari 1 karakter maka akan error,
        ini disebut data primitif
        nilai berdasarkan ASCII
         */

        char c = 'A';
        System.out.println("\n=====CHAR======");
        System.out.printf("nilai char : %c\n", c);
        System.out.printf("nilai max char : %c\n", Character.MAX_VALUE);
        System.out.printf("nilai min char : %c\n", Character.MIN_VALUE);
        System.out.printf("besar char : %d byte\n", Character.BYTES);
        System.out.printf("besar char : %d bit\n", Character.SIZE);

        // string (teks)

        /*ini disebut data reference atau data high level */
        String str = "Hello World";
        System.out.println("\n=====STRING======");
        System.out.printf("nilai string : %s\n", str);

        // boolean (true/false)
        boolean bool = true;
        System.out.println("\n=====BOOLEAN======");
        System.out.printf("nilai boolean : %b\n", bool);
        System.out.printf("nilai max boolean : %b\n", Boolean.TRUE);
        System.out.printf("nilai min boolean : %b\n", Boolean.FALSE);




    }
}
