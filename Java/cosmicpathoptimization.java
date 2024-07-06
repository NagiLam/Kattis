// Kattis - Cosmic Path Optimization
import java.util.*;

class cosmicpathoptimization {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nReading = Integer.parseInt(in.nextLine());
        int sum = 0;

        for (int i = 0; i < nReading; i++) {
            sum += in.nextInt();
        }

        System.out.println(Math.round(sum / nReading));
        in.close();
    }
}
