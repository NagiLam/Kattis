// Kattis - Faktor
import java.util.*;

class faktor {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nArticles = in.nextInt();
        int impact = in.nextInt();

        System.out.println((nArticles * (impact - 1)) + 1);
        in.close();
    }
}
