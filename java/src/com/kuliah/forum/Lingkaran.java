package com.kuliah.forum;

class menghitungLingkaran {
    // Menghitung luas
    double hitung(double diameter) {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }

    // Menghitung keliling
    double hitung(double diameter, boolean keliling) {
        double radius = diameter / 2;
        return 2 * Math.PI * radius;
    }
}

public class Lingkaran {
    public static void main(String[] args) {
        menghitungLingkaran ling = new menghitungLingkaran();
        double diameter = 10;

        System.out.printf("Luas: %.2f\n", ling.hitung(diameter));
        System.out.printf("Keliling: %.2f\n", ling.hitung(diameter, true));
    }
}

