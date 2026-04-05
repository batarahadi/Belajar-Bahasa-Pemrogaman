import java.util.Arrays;
public class ArrayInsertion {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        int elemenBaru = 25;
        int pos = 2; // Menyisipkan pada indeks ke-2
        // Menyimpan array hasil penyisipan
        int[] hasil = new int[angka.length + 1];
        // Menyalin elemen-elemen sebelum posisi penyisipan
        for (int i = 0; i < pos; i++) {
            hasil[i] = angka[i];
        }
        System.out.println(Arrays.toString(hasil));
        // Menyisipkan elemen baru
        hasil[pos] = elemenBaru;
        System.out.println(Arrays.toString(hasil));
        // Menyalin elemen-elemen setelah posisi penyisipan
        for (int i = pos; i < angka.length; i++) {
            hasil[i + 1] = angka[i];
        }
        System.out.println("Array setelah penyisipan: " + Arrays.toString(hasil));
    }
} 