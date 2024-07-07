// Kattis - Fimmtudagstilboð
import java.util.*;

class fimmtudagstilbod {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int price = 0;
        if (year >= 2020) {
            price = 1000 + ((year - 2020) * 100);
        } else {
            price = 1000;
        }

        System.out.println(price);
        in.close();
    }
}
