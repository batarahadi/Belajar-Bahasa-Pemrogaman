package kuliah;

public class array1dimensi {
    public static void main(String[] args) {
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        System.out.println("Menggunakan for loop");
        for (int k=0; k < days.length ;k++) {
            System.out.printf("today is %s\n", days[k]);
        }

        System.out.println("\nMenggunakan do while loop");
        int m = 0;
        do {
            System.out.printf("%s\n", days[m]);
            m++;
        } while(m<8);
    }
}