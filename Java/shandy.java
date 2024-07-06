// Kattis - Shandy
import java.util.*;

class shandy {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int nBeer = Integer.parseInt(in.nextLine());
        int nLemon = Integer.parseInt(in.nextLine());

        System.out.println((nBeer > nLemon) ? (nLemon * 2) : (nBeer * 2));
        in.close();
    }
}
