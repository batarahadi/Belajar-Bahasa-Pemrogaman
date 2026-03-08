package myid.bataralab;

class makanan {
    void info() {
        System.out.println("Makanan adalah sumber energi bagi tubuh.");
    }
}

class nasi extends makanan {
    @Override
    void info() {
        System.out.println("Nasi adalah makanan pokok di Indonesia.");
    }
}

class roti extends makanan {
    @Override
    void info() {
        System.out.println("Roti adalah makanan yang terbuat dari tepung.");
    }
}

public class coba {
    public static void main(String[] args) {
        makanan batu = new nasi();
        makanan sariRoti = new roti();
        batu.info();
        sariRoti.info();
    }
}
