// Kattis - Reverse
import java.util.*;

class ofugsnuid {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
        }

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println(array[j]);
        }

        in.close();
    }
}
