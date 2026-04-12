class perhitungan {
    static int penjumlahan(int a, int b) {
        return a + b;
    }
    int pengurangan(int a, int b) {
        return a - b;
    }
}

public class coba {

    public static void main(String[] args) {
        perhitungan kalkulator = new perhitungan();

        int a = perhitungan.penjumlahan(5, 3);
        int b = kalkulator.pengurangan(5, 3);
        System.out.println("Hasil penjumlahan: " + a);
        System.out.println("Hasil pengurangan: " + b);
    }
}
