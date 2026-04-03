package kuliah;

public class blajarArray {
    public static void main(String[] args) {
        // nilai array
        int[] dataArray = {32, 65, 32, 12, 65, 12, 1, 99, 4, 57};
        int mencariAngka = 4;
        boolean ditemukan = false;

        // 1. Linear search
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] == mencariAngka) {
                ditemukan = true;
                System.out.printf("Element %d ditemukan diindex %d atau diurutan %d %n", mencariAngka, i, i + 1);
                break;
            }
        }
        if (!ditemukan) {
            System.out.printf("Element %d tidak ditemukan %n", mencariAngka);
        }

        // 2. Binary search
        java.util.Arrays.sort(dataArray); // Pastikan array sudah diurutkan terlebih dahulu


        int index = java.util.Arrays.binarySearch(dataArray, mencariAngka);
        if (index >= 0) {
            System.out.printf("Element %d ditemukan diindex %d atau diurutan %d %n", mencariAngka, index, index + 1);
        } else {
            System.out.printf("Element %d tidak ditemukan %n", mencariAngka);
        }
    }
}