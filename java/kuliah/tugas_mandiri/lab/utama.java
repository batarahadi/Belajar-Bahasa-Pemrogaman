package kuliah.tugas_mandiri.lab;

import java.util.ArrayList;
import java.util.Collections;

class ArrayOperations {
    private int[] array;
    private int size;

    public ArrayOperations(int[] array) {
        this.array = new int[array.length * 2];
        this.size = array.length;
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    public void traversal() {
        System.out.print("Array Traversal: [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public int linearSearch(int nilai) {
        for (int i = 0; i < size; i++)
            if (array[i] == nilai) return i;
        return -1;
    }

    public int binarySearch(int nilai) {
        int kiri = 0, kanan = size - 1;
        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            if (array[tengah] == nilai) return tengah;
            else if (array[tengah] < nilai) kiri = tengah + 1;
            else kanan = tengah - 1;
        }
        return -1;
    }

    public void insert(int nilai, int posisi) {
        System.arraycopy(array, posisi, array, posisi + 1, size - posisi);
        array[posisi] = nilai;
        size++;
    }

    public void delete(int posisi) {
        System.arraycopy(array, posisi + 1, array, posisi, size - posisi - 1);
        size--;
    }

    public int[] getArray() {
        int[] hasil = new int[size];
        System.arraycopy(array, 0, hasil, 0, size);
        return hasil;
    }

    public int getSize() { return size; }
}

class ArrayListOperations {
    private ArrayList<Integer> list;

    public ArrayListOperations(int[] data) {
        list = new ArrayList<>();
        for (int d : data) list.add(d);
    }

    public void traversal() {
        System.out.println("ArrayList Traversal: " + list);
    }

    public void tambah(int nilai, int posisi) {
        list.add(posisi, nilai);
    }

    public void hapus(int posisi) {
        list.remove(posisi);
    }

    public int cari(int nilai) {
        return list.indexOf(nilai);
    }

    public void urutkan() {
        Collections.sort(list);
    }

    public ArrayList<Integer> getList() { return list; }
}

class Comparison {
    public void jalankan() {
        int[] data = {10, 20, 30, 40, 50};
        ArrayOperations arr = new ArrayOperations(data);
        ArrayListOperations arl = new ArrayListOperations(data);

        // Traversal
        arr.traversal();
        arl.traversal();

        // Pencarian + ukur waktu
        int target = 30;
        int idxArr = arr.linearSearch(target);
        int idxArl = arl.cari(target);
        System.out.println("Pencarian " + target + " dalam Array: Ditemukan di indeks " + idxArr);
        System.out.println("Pencarian " + target + " dalam ArrayList: Ditemukan di indeks " + idxArl);

        // Penyisipan
        arr.insert(25, 2);
        arl.tambah(25, 2);
        int[] hasil = arr.getArray();
        System.out.print("Array setelah penyisipan elemen 25: [");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i]);
            if (i < hasil.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("ArrayList setelah penyisipan elemen 25: " + arl.getList());

        // Waktu eksekusi pencarian
        long t1 = System.nanoTime();
        arr.linearSearch(target);
        double wArr = (System.nanoTime() - t1) / 1e6;

        t1 = System.nanoTime();
        arl.cari(target);
        double wArl = (System.nanoTime() - t1) / 1e6;

        System.out.println("Waktu eksekusi pencarian pada Array: " + String.format("%.4f", wArr) + " ms");
        System.out.println("Waktu eksekusi pencarian pada ArrayList: " + String.format("%.4f", wArl) + " ms");
    }
}

public class utama {
    public static void main(String[] args) {
        Comparison cmp = new Comparison();
        cmp.jalankan();
    }
}
