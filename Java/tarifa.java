// Kattis - Tarifa
import java.util.*;

class tarifa {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int total = Integer.parseInt(in.nextLine());
        int nMonths = Integer.parseInt(in.nextLine());
        int sum = 0;

        for (int i = 0; i < nMonths; i++) {
            sum += total - in.nextInt();
        }

        System.out.println(sum + total);
        in.close();
    }
}
