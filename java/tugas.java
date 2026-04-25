import java.util.Scanner;

class node {
    int data;
    node selanjutnya;

    node( int a) {
        data = a;
        selanjutnya = null;
    }
}

class linkedList {

}

public class tugas {
    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah data: ");
        int jumlahData = inputSc.nextInt();

        System.out.printf("data yang dimasukkan: %d\n", jumlahData);

        inputSc.close();
    }
}