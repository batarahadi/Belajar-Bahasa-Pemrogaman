import java.util.Arrays;

public class utama {
    public static void main(String[] args) {
        int[] data = {23, 2, 45, 12, 9};
        int angkaBaru = 10;
        int posisiIdx = 4;
        int[] hasil = new int[data.length + 1];

        for (int i = 0; i < posisiIdx; i++) {
            hasil[i] = data[i];
        }
        hasil[posisiIdx] = angkaBaru;

        for (int i = posisiIdx; i < data.length; i++) {
            hasil[i + 1] = data[i];
        }
        System.out.println("Array setelah penambahan: " + Arrays.toString(hasil));
    }
}
