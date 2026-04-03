public class ArraySearch {
    public static void main(String[] args) {
        int[] angka = {3, 8, 12, 5, 7};
        int target = 12;
        boolean ditemukan = false;
        // Linear search
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == target) {
                ditemukan = true;
                System.out.println("Elemen " + target + " ditemukan pada indeks " + i);
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Elemen " + target + " tidak ditemukan.");
        }
    }
}