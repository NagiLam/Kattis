// Kattis - Cold-puter Science
import java.util.*;

class cold {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nReading = Integer.parseInt(in.nextLine());
        int count = 0;

        for (int i = 0; i < nReading; i++) {
            if (in.nextInt() < 0) {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
