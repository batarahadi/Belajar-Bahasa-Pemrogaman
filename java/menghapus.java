import java.util.Arrays;
public class menghapus{
    public static void main(String[] args) {
        int[] data = {11, 54, 75, 23, 9};
        int delIndex = 2;
        int[] result = new int[data.length - 1];
        for ( int i = 0, j = 0; i < data.length; i++) {
            if (i == delIndex) {
                continue;
            }
            result[j++] = data[i];
        }
        System.out.printf("array sebelum penghapusan: %s %n", Arrays.toString(data));
        System.out.printf("Array setelah penghapusan: %s", Arrays.toString(result));
    }
}
