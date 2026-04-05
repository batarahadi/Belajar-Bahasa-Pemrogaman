package belajar;

/*   Belajar Java [Dasar] - 17 - Mengambil Input dari Pengguna

READ ME

Jalan kan perintah di terminal
1. javac ../src/com/belajar/o17.java -d ../bin
2. java com.belajar.o8

*/


import java.util.Scanner;

public class o17 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Membaca input string dan angka dari pengguna
        System.out.print("Masukkan String: ");
        String input = userInput.nextLine();
        System.out.printf("String yang dimasukkan: %s\n", input);

        // Membaca input angka dari pengguna
        System.out.print("Masukkan angka: ");
        int angka = userInput.nextInt();
        System.out.printf("Angka yang dimasukkan: %d\n", angka);

        // Membaca input angka desimal dari pengguna
        System.out.print("Masukkan angka desimal: ");
        double desimal = userInput.nextDouble();
        System.out.printf("Angka desimal yang dimasukkan: %f\n", desimal);

        // Membaca input boolean dari pengguna
        System.out.print("Masukkan nilai boolean (true/false): ");
        boolean bool = userInput.nextBoolean();
        System.out.printf("Nilai boolean yang dimasukkan: %b\n", bool);

        // Menutup Scanner setelah selesai digunakan
        userInput.close();
    }
}
