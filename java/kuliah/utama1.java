package kuliah;

import java.util.Arrays;
public class utama1 {
    public static void main (String[] args) {
        // Deklarasi dan inisialisasi array
        int[] numbers = {5, 3, 2, 8, 1};

        // Mengurutkan array
        Arrays.sort(numbers);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(numbers));
        System.out.println("\n Elemen-elemen dalam array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elemen ke-" + i + ": " + numbers[i]);
        }
        // Mengisi array dengan nilai 0
        Arrays.fill(numbers, 0);
        System.out.println("\n Array setelah diisi: " + Arrays.toString(numbers));
    }
}