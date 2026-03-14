public class arraymultidimensi {
    public static void main(String[] args) {
        String[][] address = {
            {"Florence", "735-1234", "Manila"}, 
            {"Joyce", "983-3333", "Quezon City"}, 
            {"Becca", "456-3322", "Manila"}};
            
        System.out.println("Buku Alamat saya");
        for (int n = 0; n < address.length ; n++) {
            System.out.println("Name: " + address[n][0]);
            System.out.println("Tel.#: " + address[n][1]);
            System.out.println("Address: " + address[n][2]);
            System.out.println(); // untuk enter
        }
    }
}